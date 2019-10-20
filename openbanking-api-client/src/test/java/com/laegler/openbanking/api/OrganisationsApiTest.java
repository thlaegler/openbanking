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

import com.laegler.openbanking.model.EnrolSchema;
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
 * API tests for OrganisationsApi 
 */
public class OrganisationsApiTest {


    private OrganisationsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:8080/open-banking/v2.3", OrganisationsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Get all organisations that the client is authorised to retrieve
     *
     * Note that this was not in the original design but is included to inform the client
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeGetTest() {
        String organisationType = null;
        //api.organisationOrganisationTypeGet(organisationType);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get the given organisation&#39;s details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeOrganisationIdGetTest() {
        String organisationType = null;
        String organisationId = null;
        //api.organisationOrganisationTypeOrganisationIdGet(organisationType, organisationId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Enrol a eIDAS QWAC/QSealC-bearing participant
     *
     * Enrol an eIDAS QWAC/QSealC certificate-bearing participant onto the Open Banking Directory. Currenty only TPPs can use this enrolment endpoint, so please set &#x60;OrganisationType&#x60; to &#x60;tpp&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypePostTest() {
        String organisationType = null;
        String organisationTypeForQSealCOnboarding = null;
        EnrolSchema enrol = null;
        //api.organisationOrganisationTypePost(organisationType, organisationTypeForQSealCOnboarding, enrol);
        
        // TODO: test validations
        
        
    }
    
}
