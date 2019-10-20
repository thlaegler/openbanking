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
public class BranchesApiController implements BranchesApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
    private DefaultPortType soapService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public BranchesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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

    public ResponseEntity<BranchResponse> branchesGet(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, BranchResponse.class);
		        return new ResponseEntity<BranchResponse>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<BranchResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BranchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> branchesHead(@ApiParam(value = "Used for conditional request, to retrieve data only if modified since a given date" ) @RequestHeader(value="If-Modified-Since", required=false) String ifModifiedSince,@ApiParam(value = "Used for conditional request, to retrieve data only if the given Etag value does not match" ) @RequestHeader(value="If-None-Match", required=false) String ifNoneMatch) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, Object.class);
		        return new ResponseEntity<Object>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
