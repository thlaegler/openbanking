package com.laegler.openbanking.api;

import com.laegler.openbanking.model.SoftwareStatementRedirectURISchema;

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
public interface SoftwareStatementRedirectUrIsApi  {

    /**
     * Add a redirect URI to the given Software Statement
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Add a redirect URI to the given Software Statement", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 409, message = "Conflict"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") String softwareStatementId, SoftwareStatementRedirectURISchema softwareStatementRedirectURI);
}

