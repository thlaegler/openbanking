package com.laegler.openbanking.api;

import com.laegler.openbanking.model.CertificateOrKeyGetSchema;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Open Banking API
 *
 * <p>Latest Swagger specification for OpenBanking
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface SoftwareStatementCertificatesApi  {

    /**
     * Get certificates for the given software statement
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get certificates for the given software statement", tags={ "Software Statement Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId);

    /**
     * Get the certificate of the given type and ID for the given software statement
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get the certificate of the given type and ID for the given software statement", tags={ "Software Statement Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId, @PathParam("OrganisationAssociativeCertificateType") String organisationAssociativeCertificateType, @PathParam("CertificateOrKeyId") @Size(max=256) String certificateOrKeyId);

    /**
     * Get the certificates of the given type for the given software statement
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get the certificates of the given type for the given software statement", tags={ "Software Statement Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId, @PathParam("SoftwareStatementCertificateOrKeyType") String softwareStatementCertificateOrKeyType);

    /**
     * Add a key or create a new certificate for the given software statement
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Add a key or create a new certificate for the given software statement", tags={ "Software Statement Certificates" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId, @PathParam("SoftwareStatementCertificateOrKeyType") String softwareStatementCertificateOrKeyType, @Valid CertificateOrKeyGetSchema csROrKey);
}

