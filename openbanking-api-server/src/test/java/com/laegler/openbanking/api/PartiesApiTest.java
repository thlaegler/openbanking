/**
 * Open Banking API
 * Latest Swagger specification for OpenBanking
 *
 * OpenAPI spec version: v2.3
 * Contact: thomas.laegler@googlemail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBReadParty2;
import com.laegler.openbanking.model.OBReadParty3;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Open Banking API
 *
 * <p>Latest Swagger specification for OpenBanking
 *
 * API tests for PartiesApi 
 */
public class PartiesApiTest {


    private PartiesApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:8080/api/v1", PartiesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Get Parties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsAccountIdPartiesTest() {
        String accountId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBReadParty3 response = api.getAccountsAccountIdParties(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get Parties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsAccountIdPartyTest() {
        String accountId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBReadParty2 response = api.getAccountsAccountIdParty(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get Parties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartyTest() {
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBReadParty2 response = api.getParty(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
