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

import com.laegler.openbanking.model.CertificateOrKeyGetSchema;
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
 * API tests for SoftwareStatementCertificatesApi 
 */
public class SoftwareStatementCertificatesApiTest {


    private SoftwareStatementCertificatesApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:8080/api/v1", SoftwareStatementCertificatesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Get certificates for the given software statement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGetTest() {
        String organisationType = null;
        String organisationId = null;
        String softwareStatementId = null;
        //api.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet(organisationType, organisationId, softwareStatementId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get the certificate of the given type and ID for the given software statement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGetTest() {
        String organisationType = null;
        String organisationId = null;
        String softwareStatementId = null;
        String organisationAssociativeCertificateType = null;
        String certificateOrKeyId = null;
        //api.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet(organisationType, organisationId, softwareStatementId, organisationAssociativeCertificateType, certificateOrKeyId);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get the certificates of the given type for the given software statement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGetTest() {
        String organisationType = null;
        String organisationId = null;
        String softwareStatementId = null;
        String softwareStatementCertificateOrKeyType = null;
        //api.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Add a key or create a new certificate for the given software statement
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePostTest() {
        String organisationType = null;
        String organisationId = null;
        String softwareStatementId = null;
        String softwareStatementCertificateOrKeyType = null;
        CertificateOrKeyGetSchema csROrKey = null;
        //api.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType, csROrKey);
        
        // TODO: test validations
        
        
    }
    
}
