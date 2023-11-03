package com.example.salesforce.wiremock;

import com.example.salesforce.utils.TestConstants;
import com.example.salesforce.controller.SalesforceController;
import com.example.salesforce.service.SalesforceService;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesforceControllerWiremockTest {
    @MockBean
    private SalesforceService salesforceService;
    @Autowired
    private SalesforceController salesforceController;
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
    public void testGetSalesForceData() throws Exception {
        String accessToken = TestConstants.ACCESS_TOKEN;
        String salesForceData = TestConstants.SALESFORCE_RESPONSE;
        when(salesforceService.getAccessToken()).thenReturn(accessToken);
        when(salesforceService.connectToSalesforce(accessToken)).thenReturn(salesForceData);

        stubFor(get(urlEqualTo("/salesforce/data"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(salesForceData)));

        ResponseEntity<String> response = salesforceController.getSalesForceData();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(salesForceData, response.getBody());
    }

    @Test
    public void testAccessTokenRetrievalException() throws Exception {
        stubFor(get(urlEqualTo("/salesforce/data"))
                        .willReturn(aResponse()
                                .withStatus(500)
                                .withBody("Internal Server Error")));

        ResponseEntity<String> response = salesforceController.getSalesForceData();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
        assertThat(response.getBody()).contains("Internal Server Error");
    }
}