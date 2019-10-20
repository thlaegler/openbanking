package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWritePaymentDetailsResponse1;

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
public interface PaymentDetailsApi  {

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/domestic-payments/{DomesticPaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getDomesticPaymentsDomesticPaymentIdPaymentDetails(@PathParam("DomesticPaymentId") String domesticPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/domestic-scheduled-payments/{DomesticScheduledPaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails(@PathParam("DomesticScheduledPaymentId") String domesticScheduledPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/domestic-standing-orders/{DomesticStandingOrderId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails(@PathParam("DomesticStandingOrderId") String domesticStandingOrderId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/file-payments/{FilePaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getFilePaymentsFilePaymentIdPaymentDetails(@PathParam("FilePaymentId") String filePaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/international-payments/{InternationalPaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getInternationalPaymentsInternationalPaymentIdPaymentDetails(@PathParam("InternationalPaymentId") String internationalPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/international-scheduled-payments/{InternationalScheduledPaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails(@PathParam("InternationalScheduledPaymentId") String internationalScheduledPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Payment Details
     *
     */
    @GET
    @Path("/international-standing-orders/{InternationalStandingOrderPaymentId}/payment-details")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Payment Details", tags={ "Payment Details" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment Details Read", response = OBWritePaymentDetailsResponse1.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWritePaymentDetailsResponse1 getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails(@PathParam("InternationalStandingOrderPaymentId") String internationalStandingOrderPaymentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

