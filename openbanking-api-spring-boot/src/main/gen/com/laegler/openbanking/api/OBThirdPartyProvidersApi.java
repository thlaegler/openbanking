/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.laegler.openbanking.api;

import com.laegler.openbanking.model.InlineResponse2003;
import com.laegler.openbanking.model.ErrorResponse;
import com.laegler.openbanking.model.OBThirdPartyProviders;
import com.laegler.openbanking.model.SearchRequest;
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

@Api(value = "OBThirdPartyProviders", tags = { "" })
public interface OBThirdPartyProvidersApi {

    Logger log = LoggerFactory.getLogger(OBThirdPartyProvidersApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Search for one or more resources", nickname = "oBThirdPartyProvidersGet", notes = "", response = InlineResponse2003.class, authorizations = {
        @Authorization(value = "oauth2", scopes = {
            
            })
    }, tags={ "OBThirdPartyProviders", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/OBThirdPartyProviders",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2003> oBThirdPartyProvidersGet(@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "attributes", required = false) String attributes,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "excludedAttributes", required = false) String excludedAttributes,@ApiParam(value = "The filter string used to request a subset of resources.") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "A string indicating the attribute whose value shall be used to order the returned responses.") @Valid @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "A string indicating the order in which the 'sortBy' parameter is applied.", allowableValues = "ascending, descending") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "An integer indicating the 1-based index of the first query result.") @Valid @RequestParam(value = "startIndex", required = false) Integer startIndex,@ApiParam(value = "An integer indicating the desired maximum number of query results per page.") @Valid @RequestParam(value = "count", required = false) Integer count) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OBThirdPartyProvidersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Retrieve the resource", nickname = "oBThirdPartyProvidersIdGet", notes = "", response = OBThirdPartyProviders.class, authorizations = {
        @Authorization(value = "oauth2", scopes = {
            
            })
    }, tags={ "OBThirdPartyProviders", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/OBThirdPartyProviders/{id}",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.GET)
    default ResponseEntity<OBThirdPartyProviders> oBThirdPartyProvidersIdGet(@ApiParam(value = "The resource identifier (value of the 'id' attribute).",required=true) @PathVariable("id") String id,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "attributes", required = false) String attributes,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "excludedAttributes", required = false) String excludedAttributes) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", OBThirdPartyProviders.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OBThirdPartyProvidersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Search for one or more resources using HTTP POST", nickname = "oBThirdPartyProvidersSearchPost", notes = "Useful for executing searches without passing parameters that may contain sensitive information on the URL.", response = InlineResponse2003.class, authorizations = {
        @Authorization(value = "oauth2", scopes = {
            
            })
    }, tags={ "OBThirdPartyProviders", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/OBThirdPartyProviders/.search",
        produces = { "application/prs.openbanking.opendata.v2.3+json", "application/json; charset=utf-8", "application/jose+jwe", "application/json", "application/scim+json" }, 
        consumes = { "application/json; charset=utf-8", "application/jose+jwe", "application/jose", "application/scim+json" },
        method = RequestMethod.POST)
    default ResponseEntity<InlineResponse2003> oBThirdPartyProvidersSearchPost(@ApiParam(value = ""  )  @Valid @RequestBody SearchRequest scIM20SearchRequestMessage) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OBThirdPartyProvidersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
