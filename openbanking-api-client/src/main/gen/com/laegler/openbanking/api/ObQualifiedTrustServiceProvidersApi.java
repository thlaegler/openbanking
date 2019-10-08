package com.laegler.openbanking.api;

import com.laegler.openbanking.model.ErrorResponse;
import com.laegler.openbanking.model.InlineResponse2002;
import com.laegler.openbanking.model.OBQualifiedTrustServiceProviders;
import com.laegler.openbanking.model.SearchRequest;

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
public interface ObQualifiedTrustServiceProvidersApi  {

    /**
     * Search for one or more resources
     *
     */
    @GET
    @Path("/OBQualifiedTrustServiceProviders")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Search for one or more resources", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "SCIM 2.0 List Response Message", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "An error occurred while executing the operation", response = ErrorResponse.class) })
    public InlineResponse2002 oBQualifiedTrustServiceProvidersGet(@QueryParam("attributes")String attributes, @QueryParam("excludedAttributes")String excludedAttributes, @QueryParam("filter")String filter, @QueryParam("sortBy")String sortBy, @QueryParam("sortOrder")String sortOrder, @QueryParam("startIndex")Integer startIndex, @QueryParam("count")Integer count);

    /**
     * Retrieve the resource
     *
     */
    @GET
    @Path("/OBQualifiedTrustServiceProviders/{id}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Retrieve the resource", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The retrieved resource is included in the response body", response = OBQualifiedTrustServiceProviders.class),
        @ApiResponse(code = 200, message = "An error occurred while executing the operation", response = ErrorResponse.class) })
    public OBQualifiedTrustServiceProviders oBQualifiedTrustServiceProvidersIdGet(@PathParam("id") String id, @QueryParam("attributes")String attributes, @QueryParam("excludedAttributes")String excludedAttributes);

    /**
     * Search for one or more resources using HTTP POST
     *
     * Useful for executing searches without passing parameters that may contain sensitive information on the URL.
     *
     */
    @POST
    @Path("/OBQualifiedTrustServiceProviders/.search")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Search for one or more resources using HTTP POST", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "SCIM 2.0 List Response Message", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "An error occurred while executing the operation", response = ErrorResponse.class) })
    public InlineResponse2002 oBQualifiedTrustServiceProvidersSearchPost(SearchRequest scIM20SearchRequestMessage);
}

