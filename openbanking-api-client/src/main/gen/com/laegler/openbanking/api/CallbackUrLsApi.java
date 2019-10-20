package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBCallbackUrl1;
import com.laegler.openbanking.model.OBCallbackUrlResponse1;
import com.laegler.openbanking.model.OBCallbackUrlsResponse1;
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

/**
 * Open Banking API
 *
 * <p>Latest Swagger specification for OpenBanking
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CallbackUrLsApi  {

    /**
     * Delete a callback URI
     *
     */
    @DELETE
    @Path("/callback-urls/{CallbackUrlId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Delete a callback URI", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Callback URL changed"),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public void callbackUrlsCallbackUrlIdDelete(@PathParam("CallbackUrlId") String callbackUrlId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Amend a callback URI
     *
     */
    @PUT
    @Path("/callback-urls/{CallbackUrlId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Amend a callback URI", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Callback URL changed", response = OBCallbackUrlResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 415, message = "Unsupported Media Type"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBCallbackUrlResponse1 callbackUrlsCallbackUrlIdPut(@PathParam("CallbackUrlId") String callbackUrlId, OBCallbackUrl1 obCallbackUrl1Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Read all callback URLs
     *
     */
    @GET
    @Path("/callback-urls")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Read all callback URLs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of callback URLs", response = OBCallbackUrlsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBCallbackUrlsResponse1 callbackUrlsGet(@HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Create a callback URL
     *
     */
    @POST
    @Path("/callback-urls")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create a callback URL", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Callback URL created", response = OBCallbackUrlResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 415, message = "Unsupported Media Type"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBCallbackUrlResponse1 callbackUrlsPost(OBCallbackUrl1 obCallbackUrl1Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

