package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrderConsent4;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrderConsentResponse4;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrderResponse4;

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
public interface DomesticStandingOrdersApi  {

    /**
     * Create Domestic Standing Order Consents
     *
     */
    @POST
    @Path("/domestic-standing-order-consents")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create Domestic Standing Order Consents", tags={ "Domestic Standing Orders",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Domestic Standing Order Consents Created", response = OBWriteDomesticStandingOrderConsentResponse4.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticStandingOrderConsentResponse4 createDomesticStandingOrderConsents(@Valid OBWriteDomesticStandingOrderConsent4 obWriteDomesticStandingOrderConsent4Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-idempotency-key") String xIdempotencyKey, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Create Domestic Standing Orders
     *
     */
    @POST
    @Path("/domestic-standing-orders")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Create Domestic Standing Orders", tags={ "Domestic Standing Orders",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Domestic Standing Orders Created", response = OBWriteDomesticStandingOrderResponse4.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticStandingOrderResponse4 createDomesticStandingOrders(@Valid OBWriteDomesticStandingOrder3 obWriteDomesticStandingOrder3Param, @HeaderParam("Authorization") String authorization, @HeaderParam("x-idempotency-key") String xIdempotencyKey, @HeaderParam("x-jws-signature") String xJwsSignature, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Domestic Standing Order Consents
     *
     */
    @GET
    @Path("/domestic-standing-order-consents/{ConsentId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Domestic Standing Order Consents", tags={ "Domestic Standing Orders",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Domestic Standing Order Consents Read", response = OBWriteDomesticStandingOrderConsentResponse4.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticStandingOrderConsentResponse4 getDomesticStandingOrderConsentsConsentId(@PathParam("ConsentId") String consentId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);

    /**
     * Get Domestic Standing Orders
     *
     */
    @GET
    @Path("/domestic-standing-orders/{DomesticStandingOrderId}")
    @Consumes({ "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" })
    @Produces({ "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" })
    @ApiOperation(value = "Get Domestic Standing Orders", tags={ "Domestic Standing Orders" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Domestic Standing Orders Read", response = OBWriteDomesticStandingOrderResponse4.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    public OBWriteDomesticStandingOrderResponse4 getDomesticStandingOrdersDomesticStandingOrderId(@PathParam("DomesticStandingOrderId") String domesticStandingOrderId, @HeaderParam("Authorization") String authorization, @HeaderParam("x-fapi-auth-date") String xFapiAuthDate, @HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress, @HeaderParam("x-fapi-interaction-id") String xFapiInteractionId);
}

