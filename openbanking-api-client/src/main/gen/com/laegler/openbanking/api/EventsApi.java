package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBEventPolling1;
import com.laegler.openbanking.model.OBEventPollingResponse1;

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
public interface EventsApi  {

    /**
     * Create Events
     *
     */
    @POST
    @Path("/events")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create Events", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Events Created", response = OBEventPollingResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBEventPollingResponse1 createEvents(OBEventPolling1 obEventPolling1Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

