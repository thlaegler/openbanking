package com.laegler.openbanking.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.laegler.openbanking.soap.service.*;
import com.laegler.openbanking.soap.model.GETGetStandingOrdersInputMessage;
import com.laegler.openbanking.Transformation;
import com.laegler.openbanking.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.io.IOException;
import java.util.Optional;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.bind.JAXBException;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingServiceCodegen", date = "2019-10-21T07:44:11.158+13:00")

@RestController
@Slf4j
public class OrganisationApiController implements OrganisationApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
    private DefaultPortType soapService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public OrganisationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<Void> organisationOrganisationTypeGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The authorisation server Id",required=true) @PathVariable("AuthorisationServerId") String authorisationServerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The authorisation server Id",required=true) @PathVariable("AuthorisationServerId") String authorisationServerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The authorisation server Id",required=true) @PathVariable("AuthorisationServerId") String authorisationServerId,@ApiParam(value = "Properties to create/update authorisation server" ,required=true )  @Valid @RequestBody AuthorisationServerRequestSchema authorisationServer) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdAuthorisationServerGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdAuthorisationServerPost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "Properties to create/update authorisation server" ,required=true )  @Valid @RequestBody AuthorisationServerRequestSchema authorisationServer) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdCertificateGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=256) @ApiParam(value = "The certificate or key Id",required=true) @PathVariable("CertificateOrKeyId") String certificateOrKeyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=256) @ApiParam(value = "The certificate or key Id",required=true) @PathVariable("CertificateOrKeyId") String certificateOrKeyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "The certificate type",required=true, allowableValues = "\"qwac\", \"qseal\", \"obwac\", \"obseal\"") @PathVariable("OrganisationCertificateType") String organisationCertificateType,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "The certificate type",required=true, allowableValues = "\"qwac\", \"qseal\", \"obwac\", \"obseal\"") @PathVariable("OrganisationCertificateType") String organisationCertificateType,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "* __PEM file__ -- when the request `Content-Type` header is set to  `application/x-pem-file` the contents of the PEM file will differ depending upon `OrganisationCertificateType`. If `OrganisationCertificateType` is set to `qwac`, `qseal` then the PEM file should contain a *QWAC* or a *QSEAL* certificate respectively; if `OrganisationCertificateType` is set to `obwac` or `obseal` then the PEM file should contain a Certificate Signing Request (CSR) for an OB-issued *OBWAC* or *OBSEAL* certificate respectively. * __Signed JWT__ -- when the request `Content-Type` header is set to `application/jwt` the body of the signed JWT will contain a CSR or a certificate.  ### Requesting a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `csr` claim is the CSR in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"csr\": \"string\" } ```  ### Uploaing a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `x5c` claim is the array of certificate, issuer certificate, and root certificate in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } ```  EXAMPLE REQUEST PAYLOAD USING SIGNED JWT REQUESTS  ``` POST /organisation/tpp/123456789012345678/certificate/obwac HTTP/1.1 Content-Type: application/jwt Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmcibSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` " ,required=true )  @Valid @RequestBody CertificateOrKeyGetSchema certificateOrCSROrJWS) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdContactContactTypeGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "The contact type",required=true, allowableValues = "\"business\", \"technical\"") @PathVariable("ContactType") String contactType) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdContactContactTypePut(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "The contact type",required=true, allowableValues = "\"business\", \"technical\"") @PathVariable("ContactType") String contactType,@ApiParam(value = "Properties to update business/technical contacts" ,required=true )  @Valid @RequestBody ContactSchema contact) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementPost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@ApiParam(value = "Software Statement payload" ,required=true )  @Valid @RequestBody SoftwareStatementCreateSchema softwareStatement) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "The certificate type that can be associated with a software statement",required=true, allowableValues = "\"qseal\", \"obseal\"") @PathVariable("OrganisationAssociativeCertificateType") String organisationAssociativeCertificateType,@Size(max=256) @ApiParam(value = "The certificate or key Id",required=true) @PathVariable("CertificateOrKeyId") String certificateOrKeyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "The certificate type that can be associated with a software statement",required=true, allowableValues = "\"qseal\", \"obseal\"") @PathVariable("OrganisationAssociativeCertificateType") String organisationAssociativeCertificateType,@Size(max=256) @ApiParam(value = "The certificate or key Id",required=true) @PathVariable("CertificateOrKeyId") String certificateOrKeyId,@ApiParam(value = "Certificate or Key Association Payload" ,required=true )  @Valid @RequestBody CertificateOrKeyAssociationSchema certificateOrKeyAssociation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "The certificate or key type that can be associated with a software statement",required=true, allowableValues = "\"obtransport\", \"obsigning\", \"sigkey\", \"enckey\"") @PathVariable("SoftwareStatementCertificateOrKeyType") String softwareStatementCertificateOrKeyType) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "The certificate or key type that can be associated with a software statement",required=true, allowableValues = "\"obtransport\", \"obsigning\", \"sigkey\", \"enckey\"") @PathVariable("SoftwareStatementCertificateOrKeyType") String softwareStatementCertificateOrKeyType,@ApiParam(value = "PEM file -- the contents of the PEM file will differ depending upon *SoftwareStatementCertificateOrKeyType*. If *SoftwareStatementCertificateOrKeyType* is set to *obsigning* or *obtransport* then the PEM file should contain a Certificate Signing Request (CSR) for an OB signing or OB transport certificate respectively; if *SoftwareStatementCertificateOrKeyType* is set to *sigkey*, *enckey* then the PEM file should contain a public signing or encryption key respectively." ,required=true )  @Valid @RequestBody CertificateOrKeyGetSchema csROrKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "Payload used to deactivate/reactivate a Software Statement" ,required=true )  @Valid @RequestBody SoftwareStatementStateSchema softwareStatementState) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId,@ApiParam(value = "Software Statement Redirect URI" ,required=true )  @Valid @RequestBody SoftwareStatementRedirectURISchema softwareStatementRedirectURI) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "The organsation ID",required=true) @PathVariable("OrganisationId") String organisationId,@Size(max=22) @ApiParam(value = "The software statement ID",required=true) @PathVariable("SoftwareStatementId") String softwareStatementId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> organisationOrganisationTypePost(@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"aspsp\", \"tpp\"") @PathVariable("OrganisationType") String organisationType,@ApiParam(value = "OB Organisation Type",required=true, allowableValues = "\"tpp\"") @PathVariable("OrganisationTypeForQSealCOnboarding") String organisationTypeForQSealCOnboarding,@ApiParam(value = "The payload submitted when a TPP attempts to enrol with an eIDAS QWAC or QSealC certificate. It's format and contents will depend on the value of the `Content-Type` header:  TPP onto the Open Banking Directory (required fields to be validated). For eIDAS QSealC-bearing TPPs use a signed JWT (JWS).  * __application/json__ -- a JSON payload for QWAC onboarding. * __application/jwt__ -- a signed JWT (JWS) for QSealC onboarding. * __application/jose__ -- same as __application/jwt__.  ## QWAC-based Onboarding  Set `Content-Type` to `application/json` and send the payload conforming to the schema.  EXAMPLE REQUEST PAYLOAD FOR QWAC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/json Accept: application/json Host: matls-dirapi.openbanking.org.uk {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  ## QSealC-based Onboarding  Set `Content-Type` to `application/jwt` or `application/jose` and send the payload conforming to the schema as a signed JWT.  The QSealC, the issuing certificate, and the root certificate (all in DER format) must be used as the items of the array, which forms the value of the `x5c` claim in the JWT header.  The JWT MUST be signed using the private key associated with the QSealC listed in the `x5c` claim in the header.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\",   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  EXAMPLE REQUEST PAYLOAD FOR QSealC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/jwt | application/jose Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmciXSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` " ,required=true )  @Valid @RequestBody EnrolSchema enrol) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
