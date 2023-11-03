package com.example.salesforce.junit;

import com.example.salesforce.utils.TestConstants;
import com.example.salesforce.service.SalesforceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicStatusLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class SalesforceServiceJunitTest {
    @InjectMocks
    private SalesforceService salesforceService;
    @Mock
    private HttpClient httpClient;
    @Mock
    private HttpResponse httpResponse;
    @Mock
    private HttpEntity httpEntity;

    @BeforeEach
    public void setUp() throws IOException {

        MockitoAnnotations.initMocks(this);
        when(httpClient.execute(any(HttpGet.class))).thenReturn(httpResponse);
        when(httpClient.execute(any(HttpPost.class))).thenReturn(httpResponse);
    }

    @Test
    @DisplayName("whenConnectToSalesforceMethodThenReturnSalesForceData")
    public void testConnectToSalesforce() throws Exception {

        InputStream is = getClass().getResourceAsStream("/salesforce.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(is, Object.class);
        String jsonString = objectMapper.writeValueAsString(jsonObject);
        when(httpResponse.getEntity()).thenReturn(httpEntity);
        when(httpEntity.getContent()).thenReturn(is);
        String response = salesforceService.connectToSalesforce(TestConstants.ACCESS_TOKEN);
        assertEquals(jsonString, response);
    }

    @Test
    @DisplayName("whenConnectToSalesforceMethodThenThrowHttpClientErrorException")
    public void testGetAccessTokenInvalidAccessToken() throws Exception {

        when(httpResponse.getEntity()).thenReturn(httpEntity);
        when(httpEntity.getContent()).thenThrow(HttpClientErrorException.class);
        assertThrows(HttpClientErrorException.class, () -> salesforceService.connectToSalesforce(TestConstants.ACCESS_ERROR));
    }


    @Test
    @DisplayName("whenGetAccessTokenMethodThenReturnToken")
    public void testGetAccessToken() throws Exception {

        when(httpResponse.getEntity()).thenReturn(httpEntity);
        when(httpEntity.getContent()).thenReturn(getClass().getResourceAsStream(TestConstants.ACCESS_TOKEN));
        String accessToken = salesforceService.getAccessToken();
        String expectedAccessToken = TestConstants.ACCESS_TOKEN;
        assertEquals(expectedAccessToken, accessToken);
    }

    @Test
    @DisplayName("whenGetAccessTokenMethodThenThrowHttpClientErrorException")
    public void testGetAccessTokenInvalidCredentials() throws Exception {

        when(httpResponse.getEntity()).thenReturn(httpEntity);
        when(httpEntity.getContent()).thenThrow(HttpClientErrorException.class);
        assertThrows(HttpClientErrorException.class, () -> salesforceService.getAccessToken());
    }
}
