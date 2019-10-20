package com.laegler.openbanking;
// package com.laegler.openbanking;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
//
// @javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date =
// "2019-10-08T19:00:00.204+13:00")
//
// @Configuration
// public class SwaggerDocuConfig {
//
// ApiInfo apiInfo() {
// return new ApiInfoBuilder()
// .title("Open Banking API")
// .description("Latest Swagger specification for OpenBanking")
// .license("MIT Licence")
// .licenseUrl("http://github.org/thlaegler/openbanking-api/LICENCE")
// .termsOfServiceUrl("http://github.org/thlaegler")
// .version("v2.3")
// .contact(new Contact("","", "thomas.laegler@googlemail.com"))
// .build();
// }
//
// @Bean
// public Docket customImplementation(){
// return new Docket(DocumentationType.SWAGGER_2)
// .select()
// .apis(RequestHandlerSelectors.basePackage("com.laegler.openbanking.api"))
// .build()
// .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
// .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
// .apiInfo(apiInfo());
// }
//
// }
