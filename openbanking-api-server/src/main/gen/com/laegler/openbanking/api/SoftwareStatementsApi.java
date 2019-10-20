package com.laegler.openbanking.api;

import com.laegler.openbanking.model.SoftwareStatementCreateSchema;
import com.laegler.openbanking.model.SoftwareStatementStateSchema;

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
public interface SoftwareStatementsApi  {

    /**
     * Get all software statements for the given organisation
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get all software statements for the given organisation", tags={ "Software Statements",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId);

    /**
     * Create a software statement
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create a software statement", tags={ "Software Statements",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementPost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @Valid SoftwareStatementCreateSchema softwareStatement);

    /**
     * Get a software statement
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get a software statement", tags={ "Software Statements",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId);

    /**
     * Update a software statement
     *
     */
    @PUT
    @Path("/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Update a software statement", tags={ "Software Statements" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId, @PathParam("SoftwareStatementId") @Size(max=22) String softwareStatementId, @Valid SoftwareStatementStateSchema softwareStatementState);
}

