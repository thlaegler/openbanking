package com.laegler.openbanking.api;


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
public interface EventNotificationApi  {

    /**
     * Send an event notification
     *
     */
    @POST
    @Path("/event-notifications")
    @Consumes({ "application/jwt" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Send an event notification", tags={ "Event Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Accepted") })
    public void createEventNotification(@Valid String obEventNotification1Param, @HeaderParam("x-fapi-financial-id") String xFapiFinancialId, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

