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
public class CallbackUrlsApiController implements CallbackUrlsApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
    private DefaultPortType soapService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public CallbackUrlsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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

    public ResponseEntity<Void> callbackUrlsCallbackUrlIdDelete(@ApiParam(value = "CallbackUrlId",required=true) @PathVariable("CallbackUrlId") String callbackUrlId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OBCallbackUrlResponse1> callbackUrlsCallbackUrlIdPut(@ApiParam(value = "CallbackUrlId",required=true) @PathVariable("CallbackUrlId") String callbackUrlId,@ApiParam(value = "Create an Callback URI" ,required=true )  @Valid @RequestBody OBCallbackUrl1 obCallbackUrl1Param,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Header containing a detached JWS signature of the body of the payload." ,required=true) @RequestHeader(value="x-jws-signature", required=true) String xJwsSignature,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, OBCallbackUrlResponse1.class);
		        return new ResponseEntity<OBCallbackUrlResponse1>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<OBCallbackUrlResponse1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBCallbackUrlResponse1>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OBCallbackUrlsResponse1> callbackUrlsGet(@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, OBCallbackUrlsResponse1.class);
		        return new ResponseEntity<OBCallbackUrlsResponse1>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<OBCallbackUrlsResponse1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBCallbackUrlsResponse1>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OBCallbackUrlResponse1> callbackUrlsPost(@ApiParam(value = "Create an Callback URI" ,required=true )  @Valid @RequestBody OBCallbackUrl1 obCallbackUrl1Param,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "Header containing a detached JWS signature of the body of the payload." ,required=true) @RequestHeader(value="x-jws-signature", required=true) String xJwsSignature,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	// TODO
		        Object bodyParam = null;
		        Class<?> bodyType = bodyParam.getClass();
		        Object soapRequest = Transformation.transform(bodyParam, bodyType);
		        Object soapResponse = soapService.getGetStandingOrders((GETGetStandingOrdersInputMessage) soapRequest);
		        Object restResponse =
		            Transformation.transform(soapResponse, OBCallbackUrlResponse1.class);
		        return new ResponseEntity<OBCallbackUrlResponse1>((HttpStatus) restResponse);
            } catch (IOException | NoSuchMethodException | JAXBException | ScriptException | GETGetStandingOrders400 | GETGetStandingOrders404 | GETGetStandingOrders403 | GETGetStandingOrders401 | GETGetStandingOrders500 | GETGetStandingOrders429 | GETGetStandingOrders406 | GETGetStandingOrders405 ex) {
                log.error("Couldn't serialize response for content type application/json", ex);
                return new ResponseEntity<OBCallbackUrlResponse1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBCallbackUrlResponse1>(HttpStatus.NOT_IMPLEMENTED);
    }

}
