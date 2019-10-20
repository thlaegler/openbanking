package com.laegler.openbanking.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.laegler.openbanking.soap.service.*;
import com.laegler.openbanking.soap.model.GETGetStandingOrdersInputMessage;
import com.laegler.openbanking.Transformation;
import com.laegler.openbanking.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.io.IOException;
import java.util.Optional;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.bind.JAXBException;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingServiceCodegen", date = "2019-10-21T07:44:11.158+13:00")

@RestController
@Slf4j
public class OBThirdPartyProvidersApiController implements OBThirdPartyProvidersApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
    private DefaultPortType soapService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public OBThirdPartyProvidersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<InlineResponse2003> oBThirdPartyProvidersGet(@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "attributes", required = false) String attributes,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "excludedAttributes", required = false) String excludedAttributes,@ApiParam(value = "The filter string used to request a subset of resources.") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "A string indicating the attribute whose value shall be used to order the returned responses.") @Valid @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "A string indicating the order in which the 'sortBy' parameter is applied.", allowableValues = "ascending, descending") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "An integer indicating the 1-based index of the first query result.") @Valid @RequestParam(value = "startIndex", required = false) Integer startIndex,@ApiParam(value = "An integer indicating the desired maximum number of query results per page.") @Valid @RequestParam(value = "count", required = false) Integer count) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, InlineResponse2003.class);
		        return new ResponseEntity<InlineResponse2003>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OBThirdPartyProviders> oBThirdPartyProvidersIdGet(@ApiParam(value = "The resource identifier (value of the 'id' attribute).",required=true) @PathVariable("id") String id,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "attributes", required = false) String attributes,@ApiParam(value = "A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified.") @Valid @RequestParam(value = "excludedAttributes", required = false) String excludedAttributes) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, OBThirdPartyProviders.class);
		        return new ResponseEntity<OBThirdPartyProviders>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<OBThirdPartyProviders>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBThirdPartyProviders>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> oBThirdPartyProvidersSearchPost(@ApiParam(value = ""  )  @Valid @RequestBody SearchRequest scIM20SearchRequestMessage) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, InlineResponse2003.class);
		        return new ResponseEntity<InlineResponse2003>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

}
