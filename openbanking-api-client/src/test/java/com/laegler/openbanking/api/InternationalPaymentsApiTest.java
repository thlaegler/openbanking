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
import com.laegler.openbanking.model.OBWriteFundsConfirmationResponse1;
import com.laegler.openbanking.model.OBWriteInternational2;
import com.laegler.openbanking.model.OBWriteInternationalConsent3;
import com.laegler.openbanking.model.OBWriteInternationalConsentResponse3;
import com.laegler.openbanking.model.OBWriteInternationalResponse3;
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
 * API tests for InternationalPaymentsApi 
 */
public class InternationalPaymentsApiTest {


    private InternationalPaymentsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:8080/api/v1", InternationalPaymentsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Create International Payment Consents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInternationalPaymentConsentsTest() {
        OBWriteInternationalConsent3 obWriteInternationalConsent3Param = null;
        String authorization = null;
        String xIdempotencyKey = null;
        String xJwsSignature = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBWriteInternationalConsentResponse3 response = api.createInternationalPaymentConsents(obWriteInternationalConsent3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Create International Payments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInternationalPaymentsTest() {
        OBWriteInternational2 obWriteInternational2Param = null;
        String authorization = null;
        String xIdempotencyKey = null;
        String xJwsSignature = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBWriteInternationalResponse3 response = api.createInternationalPayments(obWriteInternational2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get International Payment Consents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternationalPaymentConsentsConsentIdTest() {
        String consentId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBWriteInternationalConsentResponse3 response = api.getInternationalPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get International Payment Consents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternationalPaymentConsentsConsentIdFundsConfirmationTest() {
        String consentId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBWriteFundsConfirmationResponse1 response = api.getInternationalPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get International Payments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternationalPaymentsInternationalPaymentIdTest() {
        String internationalPaymentId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        //OBWriteInternationalResponse3 response = api.getInternationalPaymentsInternationalPaymentId(internationalPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
