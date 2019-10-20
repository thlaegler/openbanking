package com.laegler.openbanking.api;

import com.laegler.openbanking.model.InlineResponse201;
import com.laegler.openbanking.model.OBErrorResponse1;

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
public interface ClientRegistrationApi  {

    /**
     * Delete a client by way of Client ID
     *
     */
    @DELETE
    @Path("/register/{ClientId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Delete a client by way of Client ID", tags={ "Client Registration",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Client deleted"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 405, message = "Forbidden", response = OBErrorResponse1.class) })
    public void registerClientIdDelete(@PathParam("ClientId") String clientId, @HeaderParam("Authorization") String authorization);

    /**
     * Get a client by way of Client ID
     *
     */
    @GET
    @Path("/register/{ClientId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get a client by way of Client ID", tags={ "Client Registration",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Client registration", response = InlineResponse201.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class) })
    public InlineResponse201 registerClientIdGet(@PathParam("ClientId") String clientId, @HeaderParam("Authorization") String authorization);

    /**
     * Update a client by way of Client ID
     *
     */
    @PUT
    @Path("/register/{ClientId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Update a client by way of Client ID", tags={ "Client Registration",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Client registration", response = InlineResponse201.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class) })
    public InlineResponse201 registerClientIdPut(@PathParam("ClientId") String clientId, @HeaderParam("Authorization") String authorization, @Valid String requestBody);

    /**
     * Register a client by way of a Software Statement Assertion
     *
     * Endpoint will be secured by way of Mutual Authentication over TLS
     *
     */
    @POST
    @Path("/register")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Register a client by way of a Software Statement Assertion", tags={ "Client Registration" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Client registration", response = InlineResponse201.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class) })
    public InlineResponse201 registerPost(@Valid String requestBody);
}

