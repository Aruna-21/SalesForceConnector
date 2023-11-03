package com.example.salesforce.service;

import com.example.salesforce.utils.Constants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
public class SalesforceService {
    /**
     *
     * @return accessToken
     * @throws Exception
     */
    public String getAccessToken() throws Exception {
        HttpClient httpClient = HttpClients.createDefault();
        URI uri = new URIBuilder(Constants.OAUTH_URL).build();

        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, Constants.CONTENT_TYPE);

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("grant_type", Constants.GRANT_TYPE));
        params.add(new BasicNameValuePair("client_id", Constants.CLIENT_ID));
        params.add(new BasicNameValuePair("client_secret", Constants.CLIENT_SECRET));
        params.add(new BasicNameValuePair("username", Constants.USERNAME));
        params.add(new BasicNameValuePair("password", Constants.PASSWORD));

        httpPost.setEntity(new UrlEncodedFormEntity(params));
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity entity = response.getEntity();

        String responseBody = EntityUtils.toString(entity);

        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        String accessToken = jsonObject.get("access_token").getAsString();
        return accessToken;
    }

    /**
     *
     * @param accessToken
     * @return salesforceData
     * @throws Exception
     */
    public String connectToSalesforce(String accessToken) throws Exception {

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(Constants.SALESFORCE_URL);
        httpGet.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String responseBody = EntityUtils.toString(entity);
        return responseBody;
    }
}