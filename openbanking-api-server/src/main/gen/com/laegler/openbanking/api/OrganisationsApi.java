package com.laegler.openbanking.api;

import com.laegler.openbanking.model.EnrolSchema;

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
public interface OrganisationsApi  {

    /**
     * Get all organisations that the client is authorised to retrieve
     *
     * Note that this was not in the original design but is included to inform the client
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get all organisations that the client is authorised to retrieve", tags={ "Organisations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of the organisation - Schema in scim-swagger.json "),
        @ApiResponse(code = 406, message = "Not Acceptable") })
    public void organisationOrganisationTypeGet(@PathParam("OrganisationType") String organisationType);

    /**
     * Get the given organisation&#39;s details
     *
     */
    @GET
    @Path("/organisation/{OrganisationType}/{OrganisationId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get the given organisation's details", tags={ "Organisations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Full details of the organisation - Schema in scim-swagger.json "),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 406, message = "Not Acceptable") })
    public void organisationOrganisationTypeOrganisationIdGet(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationId") String organisationId);

    /**
     * Enrol a eIDAS QWAC/QSealC-bearing participant
     *
     * Enrol an eIDAS QWAC/QSealC certificate-bearing participant onto the Open Banking Directory. Currenty only TPPs can use this enrolment endpoint, so please set &#x60;OrganisationType&#x60; to &#x60;tpp&#x60;
     *
     */
    @POST
    @Path("/organisation/{OrganisationType}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Enrol a eIDAS QWAC/QSealC-bearing participant", tags={ "Organisations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 502, message = "Bad Gateway") })
    public void organisationOrganisationTypePost(@PathParam("OrganisationType") String organisationType, @PathParam("OrganisationTypeForQSealCOnboarding") String organisationTypeForQSealCOnboarding, @Valid EnrolSchema enrol);
}

