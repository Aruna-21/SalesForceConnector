package com.example.salesforce.junit;

import com.example.salesforce.controller.SalesforceController;
import com.example.salesforce.utils.TestConstants;
import com.example.salesforce.service.SalesforceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.InputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SalesforceControllerJunitTest {
    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private SalesforceController salesforceController;
    @Mock
    private SalesforceService salesforceService;
    ObjectMapper mapper = new ObjectMapper();

    @Test
    @DisplayName("whenGetSalesForceDataThenReturnSalesForceData")
    void testGetDataFromSalesforce() throws Exception {

        InputStream is = getClass().getResourceAsStream("/salesforce.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(is, Object.class);
        String salesForceData = objectMapper.writeValueAsString(jsonObject);
        String accessToken = TestConstants.ACCESS_TOKEN;
        when(salesforceService.getAccessToken()).thenReturn(accessToken);
        when(salesforceService.connectToSalesforce(accessToken)).thenReturn(salesForceData);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(TestConstants.GET_SALESFORCE_ENDPOINT))
                .andExpect(status().isOk())
                .andReturn();
        String responseContent = result.getResponse().getContentAsString();
        assertEquals(salesForceData, responseContent);
    }



    @Test
    @DisplayName("whenGetSalesForceDataThenThrowInternalServerError")
    public void testGetSalesForceDataError() throws Exception {

        SalesforceService salesforceService = Mockito.mock(SalesforceService.class);
        SalesforceController controller = new SalesforceController();
        Mockito.when(salesforceService.getAccessToken()).thenThrow(new Exception("Internal Server Error"));
        ResponseEntity<String> response = controller.getSalesForceData();
        assertEquals(500, response.getStatusCodeValue());
        assertEquals("An error occurred while retrieving Salesforce data.", response.getBody());
    }


}
