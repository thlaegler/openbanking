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
public interface OrganisationCertificatesApi  {

    /**
     * Get the certificates for the given organisation
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/certificate")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get the certificates for the given organisation", tags={ "Organisation Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdCertificateGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId);

    /**
     * Revoke or remove a certificate with the given CertificateOrKeyId
     *
     */
    @DELETE
    @Path("/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Revoke or remove a certificate with the given CertificateOrKeyId", tags={ "Organisation Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("CertificateOrKeyId") @Size(max=256) String certificateOrKeyId);

    /**
     * Retrieve a certificate with the given CertificateOrKeyId
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Retrieve a certificate with the given CertificateOrKeyId", tags={ "Organisation Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("CertificateOrKeyId") @Size(max=256) String certificateOrKeyId);

    /**
     * Get the certificates of the given OrganisationCertificateType for the given oranisation
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get the certificates of the given OrganisationCertificateType for the given oranisation", tags={ "Organisation Certificates",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("OrganisationCertificateType") String organisationCertificateType, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId);

    /**
     * Store or create a new certificate of the given OrganisationCertificateType for the given organisation
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Store or create a new certificate of the given OrganisationCertificateType for the given organisation", tags={ "Organisation Certificates" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("OrganisationCertificateType") String organisationCertificateType, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId, @Valid CertificateOrKeyGetSchema certificateOrCSROrJWS);
}

