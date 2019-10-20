package com.laegler.openbanking.api;

import com.laegler.openbanking.model.BranchCurrentAccountResponse;

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
public interface BcaApi  {

    @GET
    @Path("/business-current-accounts")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response with a list of `Branch Current Account` data", response = BranchCurrentAccountResponse.class),
        @ApiResponse(code = 400, message = "You have sent a request which could not be understood.", response = Map.class, responseContainer = "Map"),
        @ApiResponse(code = 408, message = "Your client has failed to submit a request, and a timeout has occurred.", response = Map.class, responseContainer = "Map"),
        @ApiResponse(code = 429, message = "You have requested this resource too often. Slow down.", response = Map.class, responseContainer = "Map"),
        @ApiResponse(code = 500, message = "An error occurred on the server. No further information is available.", response = Map.class, responseContainer = "Map"),
        @ApiResponse(code = 503, message = "The service is temporarily unavailable.", response = Map.class, responseContainer = "Map"),
        @ApiResponse(code = 200, message = "A standard error response.", response = Map.class, responseContainer = "Map") })
    public BranchCurrentAccountResponse businessCurrentAccountsGet(@HeaderParam("If-Modified-Since") String ifModifiedSince, @HeaderParam("If-None-Match") String ifNoneMatch);

    @HEAD
    @Path("/business-current-accounts")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No response", response = Object.class) })
    public Object businessCurrentAccountsHead(@HeaderParam("If-Modified-Since") String ifModifiedSince, @HeaderParam("If-None-Match") String ifNoneMatch);
}

