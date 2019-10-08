package com.laegler.openbanking.api;

import com.laegler.openbanking.model.BranchResponse;
import com.laegler.openbanking.model.Error400;
import com.laegler.openbanking.model.Error408;
import com.laegler.openbanking.model.Error429;
import com.laegler.openbanking.model.Error500;
import com.laegler.openbanking.model.Error503;
import com.laegler.openbanking.model.ErrorDefault;

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
public interface BranchApi  {

    @GET
    @Path("/branches")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "", tags={ "Branch",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response with a list of `Branch` data", response = BranchResponse.class),
        @ApiResponse(code = 400, message = "You have sent a request which could not be understood.", response = Error400.class),
        @ApiResponse(code = 408, message = "Your client has failed to submit a request, and a timeout has occurred.", response = Error408.class),
        @ApiResponse(code = 429, message = "You have requested this resource too often. Slow down.", response = Error429.class),
        @ApiResponse(code = 500, message = "An error occurred on the server. No further information is available.", response = Error500.class),
        @ApiResponse(code = 503, message = "The service is temporarily unavailable.", response = Error503.class),
        @ApiResponse(code = 200, message = "A standard error response.", response = ErrorDefault.class) })
    public BranchResponse branchesGet(@HeaderParam("If-Modified-Since") String ifModifiedSince, @HeaderParam("If-None-Match") String ifNoneMatch);

    @HEAD
    @Path("/branches")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "", tags={ "Branch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "No response", response = Object.class) })
    public Object branchesHead(@HeaderParam("If-Modified-Since") String ifModifiedSince, @HeaderParam("If-None-Match") String ifNoneMatch);
}

