/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.laegler.openbanking.api;

import com.laegler.openbanking.model.Error503;
import com.laegler.openbanking.model.Error429;
import com.laegler.openbanking.model.Error408;
import com.laegler.openbanking.model.ErrorDefault;
import com.laegler.openbanking.model.ATMResponse;
import com.laegler.openbanking.model.Error400;
import com.laegler.openbanking.model.Error500;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

@Api(value = "atms", tags = { "" })
public interface AtmsApi {

    Logger log = LoggerFactory.getLogger(AtmsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "atmsGet", notes = "Gets a list of all `ATM` objects.", response = ATMResponse.class, tags={ "ATM", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/atms",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.GET)
    default ResponseEntity<ATMResponse> atmsGet(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", ATMResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AtmsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "", nickname = "atmsHead", notes = "Gets header information on the current set of `ATM` data", response = Object.class, tags={ "ATM", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/atms",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.HEAD)
    default ResponseEntity<Object> atmsHead(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", Object.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AtmsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
