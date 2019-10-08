/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.laegler.openbanking.api;

import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrderConsent4;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrderConsentResponse4;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingDefinitionCodegen", date = "2019-10-19T13:24:49.660+13:00")

@Api(value = "international-standing-order-consents", tags = { "" })
public interface InternationalStandingOrderConsentsApi {

    Logger log = LoggerFactory.getLogger(InternationalStandingOrderConsentsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Create International Standing Order Consents", nickname = "createInternationalStandingOrderConsents", notes = "", response = OBWriteInternationalStandingOrderConsentResponse4.class, authorizations = {
        @Authorization(value = "TPPOAuth2Security", scopes = {
            @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "International Standing Orders", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/international-standing-order-consents",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.POST)
    default ResponseEntity<OBWriteInternationalStandingOrderConsentResponse4> createInternationalStandingOrderConsents(@ApiParam(value = "Default" ,required=true )  @Valid @RequestBody OBWriteInternationalStandingOrderConsent4 obWriteInternationalStandingOrderConsent4Param,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. " ,required=true) @RequestHeader(value="x-idempotency-key", required=true) String xIdempotencyKey,@ApiParam(value = "A detached JWS signature of the body of the payload." ,required=true) @RequestHeader(value="x-jws-signature", required=true) String xJwsSignature,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", OBWriteInternationalStandingOrderConsentResponse4.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InternationalStandingOrderConsentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get International Standing Order Consents", nickname = "getInternationalStandingOrderConsentsConsentId", notes = "", response = OBWriteInternationalStandingOrderConsentResponse4.class, authorizations = {
        @Authorization(value = "TPPOAuth2Security", scopes = {
            @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "International Standing Orders", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/international-standing-order-consents/{ConsentId}",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.GET)
    default ResponseEntity<OBWriteInternationalStandingOrderConsentResponse4> getInternationalStandingOrderConsentsConsentId(@ApiParam(value = "ConsentId",required=true) @PathVariable("ConsentId") String consentId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", OBWriteInternationalStandingOrderConsentResponse4.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default InternationalStandingOrderConsentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
