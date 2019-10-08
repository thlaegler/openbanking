package com.laegler.openbanking.codegen.module;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import com.laegler.openbanking.codegen.OpenbankingCodegenOperation;
import io.swagger.codegen.CodegenOperation;
import io.swagger.codegen.SupportingFile;
import io.swagger.codegen.languages.JavaResteasyServerCodegen;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Swagger;

@SuppressWarnings("all")
public class JavaResteasyCustomServerCodegen extends JavaResteasyServerCodegen {
  public JavaResteasyCustomServerCodegen() {
    super();
    this.artifactId = "swagger-example-api";
    this.outputFolder = "generated-code/example-swagger";
    this.apiTemplateFiles.put("apiService.mustache", ".java");
    this.apiTemplateFiles.put("apiServiceImpl.mustache", ".java");
    this.apiTemplateFiles.put("apiServiceFactory.mustache", ".java");
    this.apiTestTemplateFiles.clear();
    this.apiTestTemplateFiles.put("test/integration/apiIntegrationTest.mustache", ".java");
    this.apiTestTemplateFiles.put("test/feature/apiCucumberFeatureSteps.mustache", ".java");
    this.apiTestTemplateFiles.put("test/feature/apiCucumberFeature.mustache", ".feature");
    this.modelDocTemplateFiles.remove("model_doc.mustache");
    this.apiDocTemplateFiles.remove("api_doc.mustache");
    this.dateLibrary = "legacy";
    this.embeddedTemplateDir = (this.templateDir = (("JavaJaxRS" + File.separator) + "resteasy"));
  }

  @Override
  public String getName() {
    StringBuilder _builder = new StringBuilder();
    _builder.append("example-swagger");
    return _builder.toString();
  }

  @Override
  public String getHelp() {
    StringBuilder _builder = new StringBuilder();
    _builder.append("Generates an Example Java JAXRS-Resteasy Server application.");
    return _builder.toString();
  }

  @Override
  public void processOpts() {
    super.processOpts();
    SupportingFile _supportingFile = new SupportingFile("pom.mustache", "", "pom.xml");
    this.writeOptional(this.outputFolder, _supportingFile);
    SupportingFile _supportingFile_1 = new SupportingFile("gradle.mustache", "", "build.gradle");
    this.writeOptional(this.outputFolder, _supportingFile_1);
    SupportingFile _supportingFile_2 =
        new SupportingFile("settingsGradle.mustache", "", "settings.gradle");
    this.writeOptional(this.outputFolder, _supportingFile_2);
    SupportingFile _supportingFile_3 = new SupportingFile("README.mustache", "", "README.md");
    this.writeOptional(this.outputFolder, _supportingFile_3);
    SupportingFile _supportingFile_4 =
        new SupportingFile("web.mustache", "src/main/webapp/WEB-INF", "web.xml");
    this.writeOptional(this.outputFolder, _supportingFile_4);
    SupportingFile _supportingFile_5 =
        new SupportingFile("jboss-web.mustache", "src/main/webapp/WEB-INF", "jboss-web.xml");
    this.writeOptional(this.outputFolder, _supportingFile_5);
    SupportingFile _supportingFile_6 =
        new SupportingFile("jetty-web.mustache", "src/main/webapp/WEB-INF", "jetty-web.xml");
    this.writeOptional(this.outputFolder, _supportingFile_6);
    String _replace = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
    SupportingFile _supportingFile_7 =
        new SupportingFile("RestApplication.mustache", _replace, "RestApplication.java");
    this.writeOptional(this.outputFolder, _supportingFile_7);
    String _replace_1 =
        (((this.sourceFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_8 =
        new SupportingFile("src/oauth/ClientContent.mustache", _replace_1, "ClientContent.java");
    this.writeOptional(this.outputFolder, _supportingFile_8);
    String _replace_2 =
        (((this.sourceFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_9 =
        new SupportingFile("src/oauth/ServerContent.mustache", _replace_2, "ServerContent.java");
    this.writeOptional(this.outputFolder, _supportingFile_9);
    String _replace_3 =
        (((this.sourceFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_10 =
        new SupportingFile("src/oauth/TestContent.mustache", _replace_3, "TestContent.java");
    this.writeOptional(this.outputFolder, _supportingFile_10);
    String _replace_4 =
        (((this.sourceFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_11 =
        new SupportingFile("src/oauth/AuthEndpoint.mustache", _replace_4, "AuthEndpoint.java");
    this.writeOptional(this.outputFolder, _supportingFile_11);
    String _replace_5 =
        (((this.sourceFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_12 =
        new SupportingFile("src/oauth/TokenEndpoint.mustache", _replace_5, "TokenEndpoint.java");
    this.writeOptional(this.outputFolder, _supportingFile_12);
    SupportingFile _supportingFile_13 = new SupportingFile("dotProject.mustache", "", ".project");
    this.writeOptional(this.outputFolder, _supportingFile_13);
    SupportingFile _supportingFile_14 =
        new SupportingFile("dotClasspath.mustache", "", ".classpath");
    this.writeOptional(this.outputFolder, _supportingFile_14);
    SupportingFile _supportingFile_15 = new SupportingFile("settingsResourcesPref.mustache",
        ".settings", "org.eclipse.core.resources.prefs");
    this.writeOptional(this.outputFolder, _supportingFile_15);
    SupportingFile _supportingFile_16 = new SupportingFile("settingsFacet.mustache", ".settings",
        "org.eclipse.wst.common.project.facet.core.xml");
    this.writeOptional(this.outputFolder, _supportingFile_16);
    SupportingFile _supportingFile_17 = new SupportingFile("settingsFacetPrefs.mustache",
        ".settings", "org.eclipse.wst.common.project.facet.core.prefs.xml");
    this.writeOptional(this.outputFolder, _supportingFile_17);
    SupportingFile _supportingFile_18 = new SupportingFile("settingsResourcesPref.mustache",
        ".settings", "org.eclipse.core.resources.prefs");
    this.writeOptional(this.outputFolder, _supportingFile_18);
    SupportingFile _supportingFile_19 = new SupportingFile("settingsFacet.mustache", ".settings",
        "org.eclipse.wst.common.project.facet.core.xml");
    this.writeOptional(this.outputFolder, _supportingFile_19);
    SupportingFile _supportingFile_20 = new SupportingFile("settingsFacetPrefs.mustache",
        ".settings", "org.eclipse.wst.common.project.facet.core.prefs.xml");
    this.writeOptional(this.outputFolder, _supportingFile_20);
    String _replace_6 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_21 =
        new SupportingFile("ApiException.mustache", _replace_6, "ApiException.java");
    String _replace_7 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_22 =
        new SupportingFile("ApiOriginFilter.mustache", _replace_7, "ApiOriginFilter.java");
    String _replace_8 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_23 =
        new SupportingFile("ApiResponseMessage.mustache", _replace_8, "ApiResponseMessage.java");
    String _replace_9 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_24 =
        new SupportingFile("NotFoundException.mustache", _replace_9, "NotFoundException.java");
    String _replace_10 = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
    SupportingFile _supportingFile_25 =
        new SupportingFile("StringUtil.mustache", _replace_10, "StringUtil.java");
    String _replace_11 =
        (((this.testFolder + "/") + this.apiPackage) + "/integration").replace(".", "/");
    SupportingFile _supportingFile_26 =
        new SupportingFile("test/integration/AbstractIntegrationTest.mustache", _replace_11,
            "AbstractIntegrationTest.java");
    String _replace_12 =
        (((this.testFolder + "/") + this.apiPackage) + "/feature").replace(".", "/");
    SupportingFile _supportingFile_27 =
        new SupportingFile("test/feature/CucumberTest.mustache", _replace_12, "CucumberTest.java");
    String _replace_13 =
        (((this.testFolder + "/") + this.apiPackage) + "/feature").replace(".", "/");
    SupportingFile _supportingFile_28 =
        new SupportingFile("test/feature/AbstractCucumberFeatureSteps.mustache", _replace_13,
            "AbstractFeatureSteps.java");
    String _replace_14 =
        (((this.testFolder + "/") + this.apiPackage) + "/feature").replace(".", "/");
    SupportingFile _supportingFile_29 = new SupportingFile(
        "test/feature/CommonCucumberFeatureSteps.mustache", _replace_14, "CommonFeatureSteps.java");
    String _replace_15 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_30 =
        new SupportingFile("test/oauth/Common.mustache", _replace_15, "Common.java");
    String _replace_16 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_31 = new SupportingFile(
        "test/oauth/ClientServerOAuthTest.mustache", _replace_16, "ClientServerOAuthTest.java");
    String _replace_17 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_32 =
        new SupportingFile("test/oauth/AccessTokenPasswordCredentialsTest.mustache", _replace_17,
            "AccessTokenPasswordCredentialsTest.java");
    String _replace_18 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_33 =
        new SupportingFile("test/oauth/AccessTokenTestAuthCodeTest.mustache", _replace_18,
            "AccessTokenTestAuthCodeTest.java");
    String _replace_19 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_34 =
        new SupportingFile("test/oauth/UnauthenticatedAccessTokenTestAuthCodeTest.mustache",
            _replace_19, "UnauthenticatedAccessTokenTestAuthCodeTest.java");
    String _replace_20 = (((this.testFolder + "/") + this.apiPackage) + "/oauth").replace(".", "/");
    SupportingFile _supportingFile_35 =
        new SupportingFile("test/oauth/AccessTokenPasswordCredentialsTest.mustache", _replace_20,
            "AccessTokenPasswordCredentialsTest.java");
    this.supportingFiles
        .addAll(Arrays.asList(_supportingFile_21, _supportingFile_22, _supportingFile_23,
            _supportingFile_24, _supportingFile_25, _supportingFile_26, _supportingFile_27,
            _supportingFile_28, _supportingFile_29, _supportingFile_30, _supportingFile_31,
            _supportingFile_32, _supportingFile_33, _supportingFile_34, _supportingFile_35));
    boolean _equals = "joda".equals(this.dateLibrary);
    if (_equals) {
      String _replace_21 = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
      SupportingFile _supportingFile_36 =
          new SupportingFile("JacksonConfig.mustache", _replace_21, "JacksonConfig.java");
      String _replace_22 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
      SupportingFile _supportingFile_37 = new SupportingFile("JodaDateTimeProvider.mustache",
          _replace_22, "JodaDateTimeProvider.java");
      String _replace_23 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
      SupportingFile _supportingFile_38 = new SupportingFile("JodaLocalDateProvider.mustache",
          _replace_23, "JodaLocalDateProvider.java");
      this.supportingFiles
          .addAll(Arrays.asList(_supportingFile_36, _supportingFile_37, _supportingFile_38));
    } else {
      boolean _startsWith = this.dateLibrary.startsWith("java8");
      if (_startsWith) {
        String _replace_24 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
        SupportingFile _supportingFile_39 = new SupportingFile("OffsetDateTimeProvider.mustache",
            _replace_24, "OffsetDateTimeProvider.java");
        String _replace_25 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
        SupportingFile _supportingFile_40 =
            new SupportingFile("LocalDateProvider.mustache", _replace_25, "LocalDateProvider.java");
        this.supportingFiles.addAll(Arrays.asList(_supportingFile_39, _supportingFile_40));
      }
    }
  }

  @Override
  public String apiTestFilename(final String templateName, final String tag) {
    String _xblockexpression = null;
    {
      String result = super.apiTestFilename(templateName, tag);
      boolean _endsWith = templateName.endsWith("IntegrationTest.mustache");
      if (_endsWith) {
        final int ix = result.lastIndexOf("/");
        result = result.replace("Test", "");
        String _substring = result.substring(0, ix);
        String _plus = (_substring + "/integration/");
        String _initialCaps = this.initialCaps(tag);
        String _plus_1 = (_plus + _initialCaps);
        String _plus_2 = (_plus_1 + "ApiIntegrationTest.java");
        result = _plus_2;
        String _apiFileFolder = this.apiFileFolder();
        String _replace = this.apiPackage().replace(".", "/");
        String _plus_3 = ((this.testFolder + "/") + _replace);
        result = result.replace(_apiFileFolder, _plus_3);
      } else {
        boolean _endsWith_1 = templateName.endsWith("CucumberFeature.mustache");
        if (_endsWith_1) {
          final int ix_1 = result.lastIndexOf("/");
          String _substring_1 = result.substring(0, ix_1);
          String _plus_4 = (_substring_1 + "/feature/");
          String _plus_5 = (_plus_4 + tag);
          String _plus_6 = (_plus_5 + "/");
          String _plus_7 = (_plus_6 + tag);
          String _plus_8 = (_plus_7 + ".feature");
          result = _plus_8;
          result = result.replace(this.apiFileFolder(), (this.testFolder + "/feature"));
        } else {
          boolean _endsWith_2 = templateName.endsWith("CucumberFeatureSteps.mustache");
          if (_endsWith_2) {
            final int ix_2 = result.lastIndexOf("/");
            result = result.replace("Test", "");
            String _substring_2 = result.substring(0, ix_2);
            String _plus_9 = (_substring_2 + "/feature/");
            String _plus_10 = (_plus_9 + tag);
            String _plus_11 = (_plus_10 + "/");
            String _initialCaps_1 = this.initialCaps(tag);
            String _plus_12 = (_plus_11 + _initialCaps_1);
            String _plus_13 = (_plus_12 + "ApiFeatureSteps.java");
            result = _plus_13;
            String _apiFileFolder_1 = this.apiFileFolder();
            String _replace_1 = this.apiPackage().replace(".", "/");
            String _plus_14 = ((this.testFolder + "/") + _replace_1);
            result = result.replace(_apiFileFolder_1, _plus_14);
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  @Override
  public OpenbankingCodegenOperation fromOperation(final String path, final String httpMethod,
      final Operation operation, final Map<String, Model> definitions, final Swagger swagger) {
    OpenbankingCodegenOperation _xblockexpression = null;
    {
      final CodegenOperation op =
          super.fromOperation(path, httpMethod, operation, definitions, swagger);
      OpenbankingCodegenOperation it = new OpenbankingCodegenOperation();
      // final Procedure1<ExampleCodegenOperation> _function = ;

      it.httpMethodLowerCase = httpMethod.toLowerCase();
      it.description = operation.getDescription();
      it.allParams = op.allParams;
      it.authMethods = op.authMethods;
      it.baseName = op.baseName;
      it.bodyParam = op.bodyParam;
      it.bodyParams = op.bodyParams;
      it.consumes = op.consumes;
      it.defaultResponse = op.defaultResponse;
      it.discriminator = op.discriminator;
      it.examples = op.examples;
      it.externalDocs = op.externalDocs;
      it.formParams = op.formParams;
      it.hasAuthMethods = op.hasAuthMethods;
      it.hasConsumes = op.hasConsumes;
      it.hasMore = op.hasMore;
      it.hasOptionalParams = op.hasOptionalParams;
      it.hasParams = op.hasParams;
      it.hasProduces = op.hasProduces;
      it.hasReference = op.hasReference;
      it.headerParams = op.headerParams;
      it.httpMethod = op.httpMethod;
      it.imports = op.imports;
      it.isListContainer = op.isListContainer;
      it.isMapContainer = op.isMapContainer;
      it.isMultipart = op.isMultipart;
      it.isResponseBinary = op.isResponseBinary;
      it.nickname = op.nickname;
      it.notes = op.notes;
      it.operationId = op.operationId;
      it.operationIdLowerCase = op.operationIdLowerCase;
      it.path = op.path;
      it.pathParams = op.pathParams;
      it.produces = op.produces;
      it.queryParams = op.queryParams;
      it.responses = op.responses;
      it.returnBaseType = op.returnBaseType;
      it.returnContainer = op.returnContainer;
      it.returnSimpleType = op.returnSimpleType;
      it.returnType = op.returnType;
      it.returnTypeIsPrimitive = op.returnTypeIsPrimitive;
      it.subresourceOperation = op.subresourceOperation;
      it.summary = op.summary;
      it.tags = op.tags;
      it.unescapedNotes = op.unescapedNotes;
      it.vendorExtensions = op.vendorExtensions;

      it.path = this.sanitizePath(it.path);
      _xblockexpression = it;
    }
    return _xblockexpression;
  }

  private String sanitizePath(final String p) {
    return p.replaceAll("\"", "%22");
  }
}
