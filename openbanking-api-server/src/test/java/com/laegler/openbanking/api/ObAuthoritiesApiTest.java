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

import com.laegler.openbanking.model.ErrorResponse;
import com.laegler.openbanking.model.InlineResponse2001;
import com.laegler.openbanking.model.OBAuthorities;
import com.laegler.openbanking.model.SearchRequest;
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
 * API tests for ObAuthoritiesApi 
 */
public class ObAuthoritiesApiTest {


    private ObAuthoritiesApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:8080/open-banking/v2.3", ObAuthoritiesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Search for one or more resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oBAuthoritiesGetTest() {
        String attributes = null;
        String excludedAttributes = null;
        String filter = null;
        String sortBy = null;
        String sortOrder = null;
        Integer startIndex = null;
        Integer count = null;
        //InlineResponse2001 response = api.oBAuthoritiesGet(attributes, excludedAttributes, filter, sortBy, sortOrder, startIndex, count);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Retrieve the resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oBAuthoritiesIdGetTest() {
        String id = null;
        String attributes = null;
        String excludedAttributes = null;
        //OBAuthorities response = api.oBAuthoritiesIdGet(id, attributes, excludedAttributes);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Search for one or more resources using HTTP POST
     *
     * Useful for executing searches without passing parameters that may contain sensitive information on the URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oBAuthoritiesSearchPostTest() {
        SearchRequest scIM20SearchRequestMessage = null;
        //InlineResponse2001 response = api.oBAuthoritiesSearchPost(scIM20SearchRequestMessage);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}