package com.example.salesforce.controller;

import com.example.salesforce.service.SalesforceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salesforce")
public class SalesforceController {
    @Autowired
    private SalesforceService salesforceService;

    /**
     * @return SalesforceData
     * @throws Exception
     */
    @GetMapping("/data")
    public ResponseEntity<String> getSalesForceData() throws Exception {

            String accessToken = salesforceService.getAccessToken();
            String salesForceData = salesforceService.connectToSalesforce(accessToken);
            return ResponseEntity.ok(salesForceData);
    }
}