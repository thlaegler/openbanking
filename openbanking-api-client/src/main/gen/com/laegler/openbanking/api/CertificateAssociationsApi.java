package com.laegler.openbanking.api;

import com.laegler.openbanking.model.CertificateOrKeyAssociationSchema;

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

/**
 * Open Banking API
 *
 * <p>Latest Swagger specification for OpenBanking
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CertificateAssociationsApi  {

    /**
     * Associate/de-associate a QSEAL/OBSEAL certificate with the given software statement
     *
     */
    @PUT
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Associate/de-associate a QSEAL/OBSEAL certificate with the given software statement", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 409, message = "Conflict"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") String softwareStatementId, @PathParam("OrganisationAssociativeCertificateType") String organisationAssociativeCertificateType, @PathParam("CertificateOrKeyId") String certificateOrKeyId, CertificateOrKeyAssociationSchema certificateOrKeyAssociation);
}

