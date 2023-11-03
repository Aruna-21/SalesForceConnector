package com.example.salesforce.wiremock;

import com.example.salesforce.utils.TestConstants;
import com.example.salesforce.service.SalesforceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.InputStream;

import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesforceServiceWiremockTest {
    @Autowired
    private SalesforceService salesforceService;
    private WireMockServer wireMockServer;
    @Before
    public void setup() {
        wireMockServer = new WireMockServer(8081);
        wireMockServer.start();
        WireMock.configureFor("localhost", 8081);
    }

    @After
    public void tearDown() {
        wireMockServer.stop();
    }

    @Test
    public void testConnectToSalesforce() throws Exception {
        InputStream is = getClass().getResourceAsStream("/salesforce.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(is, Object.class);
        String expectedResponse = objectMapper.writeValueAsString(jsonObject);
        stubFor(WireMock.get(WireMock.urlEqualTo("https://sacumen-f-dev-ed.develop.my.salesforce.com/services/data/v59.0/sobjects/EventLogFile/describe"))
                .withHeader(HttpHeaders.AUTHORIZATION, WireMock.equalTo("Bearer 00D5g00000KLQQg!AQcAQEajuuwCT4_KSG6zBoBrnWmDK.tY94LKq32tol2zaRHnRJMGtnDFjl0nRlnw5fI2sMIJFRTFp4onSL6bWbJz3GvzQbhc"))
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.SC_OK)
                        .withHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                        .withBody(expectedResponse)));

        String accessToken = TestConstants.ACCESS_TOKEN;
        String response = salesforceService.connectToSalesforce(accessToken);

        Assert.assertEquals(expectedResponse, response);
    }

    @Test
    public void testGetAccessToken() throws Exception {
        String expectedResponse = TestConstants.ACCESS_TOKEN;
        stubFor(WireMock.post(WireMock.urlEqualTo("https://login.salesforce.com/services/oauth2/token"))
                .withHeader(HttpHeaders.CONTENT_TYPE, WireMock.equalTo("application/x-www-form-urlencoded"))
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.SC_OK)
                        .withHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                        .withBody(expectedResponse)));

        String accessToken = salesforceService.getAccessToken();

        Assert.assertEquals(expectedResponse, accessToken);
    }

    @Test
    public void testConnectToSalesforceHttpClientError() throws Exception {
        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/services/data/v59.0/sobjects/EventLogFile/describe"))
                .withHeader(HttpHeaders.AUTHORIZATION, WireMock.equalTo("Bearer 00D5g00000KLQQg!AQcAQEajuuwCT4_KSG6zBoBrnWmDK.tY94LKq32tol2zaRHnRJMGtnDFjl0nRlnw5fI2sMIJFRTFp4onSL6bWbJz3GvzQbhc"))
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.SC_NOT_FOUND)
                        .withHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                        .withBody("Not Found")));

        SalesforceService salesforceService = new SalesforceService();
        String accessToken = "validAccessToken";

        Exception exception = assertThrows(Exception.class, () -> salesforceService.connectToSalesforce(accessToken));
    }
}
