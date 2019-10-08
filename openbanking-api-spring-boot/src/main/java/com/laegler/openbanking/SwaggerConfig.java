package com.laegler.openbanking;

import static com.google.common.collect.Sets.newHashSet;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.HEAD;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicates;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.AuthorizationScopeBuilder;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  private static final String CODE_200 = "OK";
  private static final String CODE_201 = "Created";
  private static final String CODE_204 = "No Content";
  private static final String CODE_400 = "Bad Request";
  private static final String CODE_401 = "Unauthorized";
  private static final String CODE_404 = "Not Found";
  private static final String CODE_409 = "Conflict";
  private static final String CODE_500 = "Internal Server Error";

  private static final String TOKEN_URL =
      "https://noelbranzuela-eval-test.apigee.net/oauth/client_credential/accesstoken?grant_type=client_credentials";

  @Value("${spring.application.name:openbanking}")
  private String artifactId;

  @Value("${mobility23.version:0.0.1}")
  private String version;

  // @Value("${mobility23.basepath}")
  private String basePath = "";

  @Bean
  public Docket swaggerApi(final ServletContext servletContext) {
    // @formatter:off
		return new Docket(SWAGGER_2)
		    .pathProvider(new RelativePathProvider(servletContext) {
                @Override
                public String getApplicationBasePath() {
                    return basePath + servletContext.getContextPath();
                }
            })
  			.directModelSubstitute(Locale.class, String.class)
  			.directModelSubstitute(LocalDateTime.class, String.class)
  			.directModelSubstitute(LocalDate.class, String.class)
  			.ignoredParameterTypes(ApiIgnore.class).forCodeGeneration(true)
  			.protocols(protocols())
  			.forCodeGeneration(true)
//  			.apiListingReferenceOrdering(apiListingReferenceOrdering)
//  			.securitySchemes(securitySchemes())
//  			.securityContexts(securityContexts())
  			.useDefaultResponseMessages(false)
  			.globalResponseMessage(GET, asList(
  					message200(), message400(), message401(), message404(), message500()))
  			.globalResponseMessage(PUT, asList(
  					message200(), message400(), message401(), message404(), message409(), message500()))
  			.globalResponseMessage(POST, asList(
  					message201(), message400(), message401(), message409(), message500()))
  			.globalResponseMessage(DELETE, asList(
  					message204(), message400(), message401(), message500()))
  			.globalResponseMessage(HEAD, asList(
                message204(), message400(), message401(), message500()))
//  			.globalOperationParameters(operationParameters())
  			.apiInfo(apiInfo())
  			.select()
              .apis(basePackage("com.laegler.openbanking"))
              .paths(PathSelectors.any())
  			.build();
		// @formatter:on
  }

  @Bean
  public SecurityConfiguration security() {
    SecurityConfiguration secConf = new SecurityConfiguration("q43eqG0OymRAJ9eYaiqFeh3d86sfZCtc",
        "4gZJwOLrUoAMIneX", "", artifactId, "", null, "", "");
    return secConf;
  }

  @SuppressWarnings("unused")
  private List<Parameter> operationParameters() {
    Parameter localeParam = new ParameterBuilder().name("accept-language")
        .description("Language (IETF BCP 47)").required(false).modelRef(new ModelRef("string"))
        .parameterType("header").defaultValue("en-US").build();
    return asList(localeParam);
  }

  @SuppressWarnings("unused")
  private List<SecurityContext> securityContexts() {
    return asList(//
        SecurityContext.builder()//
            .securityReferences(
                asList(SecurityReference.builder().reference("OAuth2ClientCredentials")
                    .scopes(authScopes().toArray(new AuthorizationScope[0])).build()))//
            .forPaths(Predicates.not(PathSelectors.regex("/swagger.*|/webjars.*|v2/.*"))).build(),
        SecurityContext.builder()//
            .securityReferences(asList(SecurityReference.builder().reference("OAuth2UserPassword")
                .scopes(authScopes().toArray(new AuthorizationScope[0])).build()))//
            .forPaths(Predicates.not(PathSelectors.regex("/swagger.*|/webjars.*|v2/.*"))).build());
  }

  @SuppressWarnings("unused")
  private List<SecurityScheme> securitySchemes() {
    return asList(clientCredentialsGrant(), userPasswordGrant());
  }

  private SecurityScheme clientCredentialsGrant() {
    return new OAuthBuilder().name("clientCredentialsGrant").scopes(authScopes()).build();
    // .grantTypes(asList(new ClientCredentialsGrant(TOKEN_URL)));
  }

  private SecurityScheme userPasswordGrant() {
    return new OAuthBuilder().name("userPasswordGrant").scopes(authScopes()).grantTypes(null)
        .build();
    // asList(new ResourceOwnerPasswordCredentialsGrant(TOKEN_URL)));
  }

  private List<AuthorizationScope> authScopes() {
    String scopes = "guest,user,admin";
    return asList(scopes.split(",")).stream()
        .map(s -> new AuthorizationScopeBuilder().scope(String.format("%s rights", s)).build())
        .collect(toList());
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title(artifactId + " REST API")
        .description("For more information visit confluence: https://openbanking.org")
        .version(version).license("MIT Licence").contact(swaggerContact())
        .termsOfServiceUrl("http://www.openbanking.com").build();
  }

  private Contact swaggerContact() {
    return new Contact("openbanking", "http://www.openbanking.org", "info@openbanking.org");
  }

  private Set<String> protocols() {
    return newHashSet("http", "https");
  }

  private ResponseMessage message200() {
    return new ResponseMessageBuilder().code(200).message(CODE_200).build();
  }

  private ResponseMessage message201() {
    return new ResponseMessageBuilder().code(201).message(CODE_201).build();
  }

  private ResponseMessage message204() {
    return new ResponseMessageBuilder().code(500).message(CODE_204).build();
  }

  private ResponseMessage message400() {
    return new ResponseMessageBuilder().code(400).message(CODE_400).build();
  }

  private ResponseMessage message401() {
    return new ResponseMessageBuilder().code(401).message(CODE_401).build();
  }

  private ResponseMessage message404() {
    return new ResponseMessageBuilder().code(404).message(CODE_404).build();
  }

  private ResponseMessage message409() {
    return new ResponseMessageBuilder().code(409).message(CODE_409).build();
  }

  private ResponseMessage message500() {
    return new ResponseMessageBuilder().code(500).message(CODE_500).build();
  }

}
