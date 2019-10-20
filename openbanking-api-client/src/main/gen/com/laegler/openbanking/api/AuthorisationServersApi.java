package com.laegler.openbanking.api;

import com.laegler.openbanking.model.AuthorisationServerRequestSchema;

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
public interface AuthorisationServersApi  {

    /**
     * Delete an Authorisation Server
     *
     */
    @DELETE
    @Path("/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Delete an Authorisation Server", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("AuthorisationServerId") String authorisationServerId);

    /**
     * Get .well-known entity
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get .well-known entity", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("AuthorisationServerId") String authorisationServerId);

    /**
     * Update .well-known entity
     *
     */
    @PUT
    @Path("/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Update .well-known entity", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Accepted"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("AuthorisationServerId") String authorisationServerId, AuthorisationServerRequestSchema authorisationServer);

    /**
     * Get all Authorisation Servers for the given organisation
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/authorisation-server")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get all Authorisation Servers for the given organisation", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdAuthorisationServerGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId);

    /**
     * Create an Authorisation Server for the given organisation
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}/{OrganisationId}/authorisation-server")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create an Authorisation Server for the given organisation", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdAuthorisationServerPost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, AuthorisationServerRequestSchema authorisationServer);
}

