package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteDomesticScheduled2;
import com.laegler.openbanking.model.OBWriteDomesticScheduledConsent3;
import com.laegler.openbanking.model.OBWriteDomesticScheduledConsentResponse3;
import com.laegler.openbanking.model.OBWriteDomesticScheduledResponse3;

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
public interface DomesticScheduledPaymentsApi  {

    /**
     * Create Domestic Scheduled Payment Consents
     *
     */
    @POST
    @Path("/domestic-scheduled-payment-consents")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create Domestic Scheduled Payment Consents", tags={ "Domestic Scheduled Payments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Domestic Scheduled Payment Consents Created", response = OBWriteDomesticScheduledConsentResponse3.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticScheduledConsentResponse3 createDomesticScheduledPaymentConsents(@Valid OBWriteDomesticScheduledConsent3 obWriteDomesticScheduledConsent3Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-idempotency-key") String xIdempotencyKey, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Create Domestic Scheduled Payments
     *
     */
    @POST
    @Path("/domestic-scheduled-payments")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create Domestic Scheduled Payments", tags={ "Domestic Scheduled Payments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Domestic Scheduled Payments Created", response = OBWriteDomesticScheduledResponse3.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticScheduledResponse3 createDomesticScheduledPayments(@Valid OBWriteDomesticScheduled2 obWriteDomesticScheduled2Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-idempotency-key") String xIdempotencyKey, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Domestic Scheduled Payment Consents
     *
     */
    @GET
    @Path("/domestic-scheduled-payment-consents/{ConsentId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Domestic Scheduled Payment Consents", tags={ "Domestic Scheduled Payments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Domestic Scheduled Payment Consents Read", response = OBWriteDomesticScheduledConsentResponse3.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticScheduledConsentResponse3 getDomesticScheduledPaymentConsentsConsentId(@PathParam("ConsentId") String consentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Domestic Scheduled Payments
     *
     */
    @GET
    @Path("/domestic-scheduled-payments/{DomesticScheduledPaymentId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Domestic Scheduled Payments", tags={ "Domestic Scheduled Payments" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Domestic Scheduled Payments Read", response = OBWriteDomesticScheduledResponse3.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticScheduledResponse3 getDomesticScheduledPaymentsDomesticScheduledPaymentId(@PathParam("DomesticScheduledPaymentId") String domesticScheduledPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

