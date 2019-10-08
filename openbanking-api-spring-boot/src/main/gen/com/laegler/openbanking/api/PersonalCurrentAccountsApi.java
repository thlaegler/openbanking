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
import com.laegler.openbanking.model.PersonalCurrentAccountResponse;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

@Api(value = "personal-current-accounts", tags = { "" })
public interface PersonalCurrentAccountsApi {

    Logger log = LoggerFactory.getLogger(PersonalCurrentAccountsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "personalCurrentAccountsGet", notes = "Gets a list of all `Personal Current Account` objects.", response = PersonalCurrentAccountResponse.class, tags={ "PCA", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/personal-current-accounts",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.GET)
    default ResponseEntity<PersonalCurrentAccountResponse> personalCurrentAccountsGet(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", PersonalCurrentAccountResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalCurrentAccountsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "", nickname = "personalCurrentAccountsHead", notes = "Gets header information on the current set of `Personal Current Account` data", response = Object.class, tags={ "PCA", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/personal-current-accounts",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.HEAD)
    default ResponseEntity<Object> personalCurrentAccountsHead(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalCurrentAccountsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
