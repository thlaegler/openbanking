package com.laegler.openbanking.codegen.module;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Objects;
import com.laegler.openbanking.codegen.OpenbankingCodegenOperation;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenParameter;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.CodegenResponse;
import io.swagger.codegen.SupportingFile;
import io.swagger.codegen.examples.ExampleGenerator;
import io.swagger.codegen.languages.JavaResteasyServerCodegen;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Response;
import io.swagger.models.Swagger;
import io.swagger.models.Tag;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.CookieParameter;
import io.swagger.models.parameters.FormParameter;
import io.swagger.models.parameters.HeaderParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.models.parameters.QueryParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.Property;

@SuppressWarnings("all")
public class OpenbankingResteasyCodegen extends JavaResteasyServerCodegen {
  protected final static Logger LOGGER = LoggerFactory.getLogger(OpenbankingResteasyCodegen.class);

  protected Map<String, String> apiIntegrationTestTemplateFiles = new HashMap<String, String>();

  protected Map<String, String> apiFeatureStepsTemplateFiles = new HashMap<String, String>();

  protected String testFolder;

  public Map<String, String> apiIntegrationTestTemplateFiles() {
    return this.apiIntegrationTestTemplateFiles;
  }

  public Map<String, String> apiFeatureStepsTemplateFiles() {
    return this.apiFeatureStepsTemplateFiles;
  }

  public String apiIntegrationTestFilename(final String templateName, final String tag) {
    final String suffix = this.apiIntegrationTestTemplateFiles().get(templateName);
    String _apiIntegrationTestFileFolder = this.apiIntegrationTestFileFolder();
    String _plus = (_apiIntegrationTestFileFolder + "/");
    String _apiIntegrationTestFilename = this.toApiIntegrationTestFilename(tag);
    String _plus_1 = (_plus + _apiIntegrationTestFilename);
    return (_plus_1 + suffix);
  }

  public String apiFeatureStepsFilename(final String templateName, final String tag) {
    final String suffix = this.apiFeatureStepsTemplateFiles().get(templateName);
    String _apiFeatureStepsFileFolder = this.apiFeatureStepsFileFolder();
    String _plus = (_apiFeatureStepsFileFolder + "/");
    String _apiFeatureStepsFilename = this.toApiFeatureStepsFilename(tag);
    String _plus_1 = (_plus + _apiFeatureStepsFilename);
    return (_plus_1 + suffix);
  }

  public String apiIntegrationTestFileFolder() {
    String _replace = this.apiPackage.replace(".", "/");
    return ((this.testFolder + "/") + _replace);
  }

  public String apiFeatureStepsFileFolder() {
    String _replace = this.apiPackage.replace(".", "/");
    return ((this.testFolder + "/") + _replace);
  }

  public String toApiIntegrationTestFilename(final String name) {
    String _apiName = this.toApiName(name);
    return (_apiName + "IntegrationTest");
  }

  public String toApiFeatureStepsFilename(final String name) {
    String _apiName = this.toApiName(name);
    return (_apiName + "FeatureSteps");
  }

  public OpenbankingResteasyCodegen() {
    super();
    this.testFolder = "src/test/java";
    this.artifactId = "swagger-jaxrs-resteasy-server";
    this.outputFolder = "generated-code/javaJaxRSMock";
    this.apiTemplateFiles.put("apiService.mustache", ".java");
    this.apiTemplateFiles.put("apiServiceImpl.mustache", ".java");
    this.apiTemplateFiles.put("apiServiceFactory.mustache", ".java");
    this.apiTestTemplateFiles.clear();
    this.apiIntegrationTestTemplateFiles.put("apiIntegrationTest.mustache", ".java");
    this.apiFeatureStepsTemplateFiles.put("apiFeatureSteps.mustache", ".java");
    this.modelDocTemplateFiles.remove("model_doc.mustache");
    this.apiDocTemplateFiles.remove("api_doc.mustache");
    this.dateLibrary = "legacy";
    StringBuilder _builder = new StringBuilder();
    _builder.append("JavaJaxRS");
    _builder.append(File.separator);
    _builder.append("resteasy");
    String _templateDir = (this.templateDir = _builder.toString());
    this.embeddedTemplateDir = _templateDir;
  }

  @Override
  public String getName() {
    StringBuilder _builder = new StringBuilder();
    _builder.append("jaxrs-resteasy");
    return _builder.toString();
  }

  @Override
  public String getHelp() {
    StringBuilder _builder = new StringBuilder();
    _builder.append("Generates a Java JAXRS-Resteasy Mock Server application.");
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
    String _replace = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_4 =
        new SupportingFile("ApiException.mustache", _replace, "ApiException.java");
    this.supportingFiles.add(_supportingFile_4);
    String _replace_1 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_5 =
        new SupportingFile("ApiOriginFilter.mustache", _replace_1, "ApiOriginFilter.java");
    this.supportingFiles.add(_supportingFile_5);
    String _replace_2 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_6 =
        new SupportingFile("ApiResponseMessage.mustache", _replace_2, "ApiResponseMessage.java");
    this.supportingFiles.add(_supportingFile_6);
    String _replace_3 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
    SupportingFile _supportingFile_7 =
        new SupportingFile("NotFoundException.mustache", _replace_3, "NotFoundException.java");
    this.supportingFiles.add(_supportingFile_7);
    SupportingFile _supportingFile_8 =
        new SupportingFile("web.mustache", "src/main/webapp/WEB-INF", "web.xml");
    this.writeOptional(this.outputFolder, _supportingFile_8);
    SupportingFile _supportingFile_9 =
        new SupportingFile("jboss-web.mustache", "src/main/webapp/WEB-INF", "jboss-web.xml");
    this.writeOptional(this.outputFolder, _supportingFile_9);
    String _replace_4 = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
    SupportingFile _supportingFile_10 =
        new SupportingFile("RestApplication.mustache", _replace_4, "RestApplication.java");
    this.writeOptional(this.outputFolder, _supportingFile_10);
    String _replace_5 = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
    SupportingFile _supportingFile_11 =
        new SupportingFile("StringUtil.mustache", _replace_5, "StringUtil.java");
    this.supportingFiles.add(_supportingFile_11);
    boolean _equals = "joda".equals(this.dateLibrary);
    if (_equals) {
      String _replace_6 = ((this.sourceFolder + "/") + this.invokerPackage).replace(".", "/");
      SupportingFile _supportingFile_12 =
          new SupportingFile("JacksonConfig.mustache", _replace_6, "JacksonConfig.java");
      this.supportingFiles.add(_supportingFile_12);
      String _replace_7 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
      SupportingFile _supportingFile_13 = new SupportingFile("JodaDateTimeProvider.mustache",
          _replace_7, "JodaDateTimeProvider.java");
      this.supportingFiles.add(_supportingFile_13);
      String _replace_8 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
      SupportingFile _supportingFile_14 = new SupportingFile("JodaLocalDateProvider.mustache",
          _replace_8, "JodaLocalDateProvider.java");
      this.supportingFiles.add(_supportingFile_14);
    } else {
      boolean _startsWith = this.dateLibrary.startsWith("java8");
      if (_startsWith) {
        String _replace_9 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
        SupportingFile _supportingFile_15 = new SupportingFile("OffsetDateTimeProvider.mustache",
            _replace_9, "OffsetDateTimeProvider.java");
        this.supportingFiles.add(_supportingFile_15);
        String _replace_10 = ((this.sourceFolder + "/") + this.apiPackage).replace(".", "/");
        SupportingFile _supportingFile_16 =
            new SupportingFile("LocalDateProvider.mustache", _replace_10, "LocalDateProvider.java");
        this.supportingFiles.add(_supportingFile_16);
      }
    }
  }

  public void addOperationToGroup(final String tag, final String resourcePath,
      final Operation operation, final OpenbankingCodegenOperation co,
      final Map<String, List<OpenbankingCodegenOperation>> operations) {
    String basePath = resourcePath;
    boolean _startsWith = basePath.startsWith("/");
    if (_startsWith) {
      basePath = basePath.substring(1);
    }
    int pos = basePath.indexOf("/");
    if ((pos > 0)) {
      basePath = basePath.substring(0, pos);
    }
    boolean _equals = Objects.equal(basePath, "");
    if (_equals) {
      basePath = "default";
    } else {
      boolean _startsWith_1 = co.path.startsWith(("/" + basePath));
      if (_startsWith_1) {
        co.path = co.path.substring(("/" + basePath).length());
      }
      boolean _isEmpty = co.path.isEmpty();
      boolean _not = (!_isEmpty);
      co.subresourceOperation = Boolean.valueOf(_not);
    }
    List<OpenbankingCodegenOperation> opList = operations.get(basePath);
    boolean _equals_1 = Objects.equal(opList, null);
    if (_equals_1) {
      ArrayList<OpenbankingCodegenOperation> _arrayList =
          new ArrayList<OpenbankingCodegenOperation>();
      opList = _arrayList;
      operations.put(basePath, opList);
    }
    opList.add(co);
    co.baseName = basePath;
  }

  @Override
  public Map<String, Object> postProcessOperations(final Map<String, Object> objs) {
    Map<String, Object> _xblockexpression = null;
    {
      Object _get = objs.get("operations");
      final Map<String, Object> operations = ((Map<String, Object>) _get);
      boolean _notEquals = (!Objects.equal(operations, null));
      if (_notEquals) {
        Object _get_1 = operations.get("operation");
        final List<OpenbankingCodegenOperation> ops = ((List<OpenbankingCodegenOperation>) _get_1);
        for (final OpenbankingCodegenOperation operation : ops) {
          {
            boolean _equals = Objects.equal(operation.hasConsumes, Boolean.TRUE);
            if (_equals) {
              final Map<String, String> firstType = operation.consumes.get(0);
              boolean _notEquals_1 = (!Objects.equal(firstType, null));
              if (_notEquals_1) {
                boolean _equals_1 = "multipart/form-data".equals(firstType.get("mediaType"));
                if (_equals_1) {
                  operation.isMultipart = Boolean.TRUE;
                }
              }
            }
            final List<CodegenResponse> responses = operation.responses;
            boolean _notEquals_2 = (!Objects.equal(responses, null));
            if (_notEquals_2) {
              for (final CodegenResponse resp : responses) {
                boolean _equals_2 = "0".equals(resp.code);
                if (_equals_2) {
                  resp.code = "200";
                }
              }
            }
            boolean _equals_3 = Objects.equal(operation.returnType, null);
            if (_equals_3) {
              operation.returnType = "Void";
            } else {
              boolean _startsWith = operation.returnType.startsWith("List");
              if (_startsWith) {
                final String rt = operation.returnType;
                final int end = rt.lastIndexOf(">");
                if ((end > 0)) {
                  operation.returnType = rt.substring("List<".length(), end).trim();
                  operation.returnContainer = "List";
                }
              } else {
                boolean _startsWith_1 = operation.returnType.startsWith("Map");
                if (_startsWith_1) {
                  final String rt_1 = operation.returnType;
                  final int end_1 = rt_1.lastIndexOf(">");
                  if ((end_1 > 0)) {
                    operation.returnType =
                        rt_1.substring("Map<".length(), end_1).split(",")[1].trim();
                    operation.returnContainer = "Map";
                  }
                } else {
                  boolean _startsWith_2 = operation.returnType.startsWith("Set");
                  if (_startsWith_2) {
                    final String rt_2 = operation.returnType;
                    final int end_2 = rt_2.lastIndexOf(">");
                    if ((end_2 > 0)) {
                      operation.returnType = rt_2.substring("Set<".length(), end_2).trim();
                      operation.returnContainer = "Set";
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = objs;
    }
    return _xblockexpression;
  }

  @Override
  public void postProcessModelProperty(final CodegenModel model, final CodegenProperty property) {
    boolean _boolean = BooleanUtils.toBoolean(model.isEnum);
    boolean _not = (!_boolean);
    if (_not) {
      model.imports.add("JsonProperty");
      boolean _boolean_1 = BooleanUtils.toBoolean(model.hasEnums);
      if (_boolean_1) {
        model.imports.add("JsonValue");
      }
    }
  }

  @Override
  public Map<String, Object> postProcessModelsEnum(final Map<String, Object> _objs) {
    Map<String, Object> _xblockexpression = null;
    {
      final Map<String, Object> objs = super.postProcessModelsEnum(_objs);
      Object _get = objs.get("imports");
      final List<Map<String, String>> imports = ((List<Map<String, String>>) _get);
      Object _get_1 = objs.get("models");
      final List<Object> models = ((List<Object>) _get_1);
      for (final Object _mo : models) {
        {
          final Map<String, Object> mo = ((Map<String, Object>) _mo);
          Object _get_2 = mo.get("model");
          final CodegenModel cm = ((CodegenModel) _get_2);
          if ((Boolean.TRUE.equals(cm.isEnum) && (!Objects.equal(cm.allowableValues, null)))) {
            cm.imports.add(this.importMapping.get("JsonValue"));
            final Map<String, String> item = new HashMap<String, String>();
            item.put("import", this.importMapping.get("JsonValue"));
            imports.add(item);
          }
        }
      }
      _xblockexpression = objs;
    }
    return _xblockexpression;
  }

  /**
   * Convert Swagger Operation object to Codegen Operation object
   * 
   * @param path the path of the operation
   * @param httpMethod HTTP method
   * @param operation Swagger operation object
   * @param definitions a map of Swagger models
   * @param swagger a Swagger object representing the spec
   * @return Codegen Operation object
   */
  @Override
  public OpenbankingCodegenOperation fromOperation(final String path, final String httpMethod,
      final Operation operation, final Map<String, Model> definitions, final Swagger swagger) {
    final OpenbankingCodegenOperation op = new OpenbankingCodegenOperation();
    final Set<String> imports = new HashSet<String>();
    op.vendorExtensions = operation.getVendorExtensions();
    String operationId = this.getOrGenerateOperationId(operation, path, httpMethod);
    operationId = this.removeNonNameElementToCamelCase(operationId);
    op.path = path;
    op.operationId = this.toOperationId(operationId);
    op.summary = this.escapeText(operation.getSummary());
    op.unescapedNotes = operation.getDescription();
    op.notes = this.escapeText(operation.getDescription());
    op.tags = operation.getTags().stream().map(t -> {
      Tag nt = new Tag();
      nt.setName(t);
      return nt;
    }).collect(Collectors.toList());
    op.hasConsumes = Boolean.valueOf(false);
    op.hasProduces = Boolean.valueOf(false);
    op.httpMethodLowerCase = httpMethod.toLowerCase();
    List<String> consumes = new ArrayList<String>();
    List<String> _consumes = operation.getConsumes();
    boolean _notEquals = (!Objects.equal(_consumes, null));
    if (_notEquals) {
      int _size = operation.getConsumes().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        consumes = operation.getConsumes();
      } else {
      }
    } else {
      if ((((!Objects.equal(swagger, null)) && (!Objects.equal(swagger.getConsumes(), null)))
          && (swagger.getConsumes().size() > 0))) {
        consumes = swagger.getConsumes();
        List<String> _consumes_1 = swagger.getConsumes();
        String _plus = ("No consumes defined in operation. Using global consumes (" + _consumes_1);
        String _plus_1 = (_plus + ") for ");
        String _plus_2 = (_plus_1 + op.operationId);
        OpenbankingResteasyCodegen.LOGGER.debug(_plus_2);
      }
    }
    if (((!Objects.equal(consumes, null)) && (consumes.size() > 0))) {
      final List<Map<String, String>> c = new ArrayList<Map<String, String>>();
      int count = 0;
      for (final String key : consumes) {
        {
          final Map<String, String> mediaType = new HashMap<String, String>();
          mediaType.put("mediaType", this.escapeText(this.escapeQuotationMark(key)));
          int _count = count;
          count = (_count + 1);
          int _size_1 = consumes.size();
          boolean _lessThan = (count < _size_1);
          if (_lessThan) {
            mediaType.put("hasMore", "true");
          } else {
            mediaType.put("hasMore", null);
          }
          c.add(mediaType);
        }
      }
      op.consumes = c;
      op.hasConsumes = Boolean.valueOf(true);
    }
    List<String> produces = new ArrayList<String>();
    List<String> _produces = operation.getProduces();
    boolean _notEquals_1 = (!Objects.equal(_produces, null));
    if (_notEquals_1) {
      int _size_1 = operation.getProduces().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        produces = operation.getProduces();
      } else {
      }
    } else {
      if ((((!Objects.equal(swagger, null)) && (!Objects.equal(swagger.getProduces(), null)))
          && (swagger.getProduces().size() > 0))) {
        produces = swagger.getProduces();
        List<String> _produces_1 = swagger.getProduces();
        String _plus_3 =
            ("No produces defined in operation. Using global produces (" + _produces_1);
        String _plus_4 = (_plus_3 + ") for ");
        String _plus_5 = (_plus_4 + op.operationId);
        OpenbankingResteasyCodegen.LOGGER.debug(_plus_5);
      }
    }
    if (((!Objects.equal(produces, null)) && (produces.size() > 0))) {
      final List<Map<String, String>> c_1 = new ArrayList<Map<String, String>>();
      int count_1 = 0;
      for (final String key_1 : produces) {
        {
          final Map<String, String> mediaType = new HashMap<String, String>();
          mediaType.put("mediaType", this.escapeText(this.escapeQuotationMark(key_1)));
          int _count = count_1;
          count_1 = (_count + 1);
          int _size_2 = produces.size();
          boolean _lessThan = (count_1 < _size_2);
          if (_lessThan) {
            mediaType.put("hasMore", "true");
          } else {
            mediaType.put("hasMore", null);
          }
          c_1.add(mediaType);
        }
      }
      op.produces = c_1;
      op.hasProduces = Boolean.valueOf(true);
    }
    if (((!Objects.equal(operation.getResponses(), null))
        && (!operation.getResponses().isEmpty()))) {
      final Response methodResponse = this.findMethodResponse(operation.getResponses());
      Set<Map.Entry<String, Response>> _entrySet = operation.getResponses().entrySet();
      for (final Map.Entry<String, Response> entry : _entrySet) {
        {
          final Response response = entry.getValue();
          final CodegenResponse r = this.fromResponse(entry.getKey(), response);
          r.hasMore = Boolean.valueOf(true);
          if ((((!Objects.equal(r.baseType, null)) && (!this.defaultIncludes.contains(r.baseType)))
              && (!this.languageSpecificPrimitives.contains(r.baseType)))) {
            imports.add(r.baseType);
          }
          boolean _equals = Objects.equal(response, methodResponse);
          r.isDefault = Boolean.valueOf(_equals);
          op.responses.add(r);
          if ((r.isBinary && r.isDefault)) {
            op.isResponseBinary = Boolean.TRUE;
          }
        }
      }
      int _size_2 = op.responses.size();
      int _minus = (_size_2 - 1);
      CodegenResponse _get = op.responses.get(_minus);
      _get.hasMore = Boolean.valueOf(false);
      boolean _notEquals_2 = (!Objects.equal(methodResponse, null));
      if (_notEquals_2) {
        Property _schema = methodResponse.getSchema();
        boolean _notEquals_3 = (!Objects.equal(_schema, null));
        if (_notEquals_3) {
          final CodegenProperty cm = this.fromProperty("response", methodResponse.getSchema());
          final Property responseProperty = methodResponse.getSchema();
          if ((responseProperty instanceof ArrayProperty)) {
            final ArrayProperty ap = ((ArrayProperty) responseProperty);
            final CodegenProperty innerProperty = this.fromProperty("response", ap.getItems());
            op.returnBaseType = innerProperty.baseType;
          } else {
            boolean _notEquals_4 = (!Objects.equal(cm.complexType, null));
            if (_notEquals_4) {
              op.returnBaseType = cm.complexType;
            } else {
              op.returnBaseType = cm.baseType;
            }
          }
          op.examples = new ExampleGenerator(definitions).generate(methodResponse.getExamples(),
              operation.getProduces(), responseProperty);
          op.defaultResponse = this.toDefaultValue(responseProperty);
          op.returnType = cm.datatype;
          op.hasReference = Boolean.valueOf(
              ((!Objects.equal(definitions, null)) && definitions.containsKey(op.returnBaseType)));
          boolean _notEquals_5 = (!Objects.equal(definitions, null));
          if (_notEquals_5) {
            final Model m = definitions.get(op.returnBaseType);
            boolean _notEquals_6 = (!Objects.equal(m, null));
            if (_notEquals_6) {
              final CodegenModel cmod = this.fromModel(op.returnBaseType, m, definitions);
              op.discriminator = cmod.discriminator;
            }
          }
          boolean _notEquals_7 = (!Objects.equal(cm.isContainer, null));
          if (_notEquals_7) {
            op.returnContainer = cm.containerType;
            boolean _equals = "map".equals(cm.containerType);
            if (_equals) {
              op.isMapContainer = Boolean.TRUE;
            } else {
              boolean _equalsIgnoreCase = "list".equalsIgnoreCase(cm.containerType);
              if (_equalsIgnoreCase) {
                op.isListContainer = Boolean.TRUE;
              } else {
                boolean _equalsIgnoreCase_1 = "array".equalsIgnoreCase(cm.containerType);
                if (_equalsIgnoreCase_1) {
                  op.isListContainer = Boolean.TRUE;
                }
              }
            }
          } else {
            op.returnSimpleType = Boolean.valueOf(true);
          }
          if ((this.languageSpecificPrimitives().contains(op.returnBaseType)
              || Objects.equal(op.returnBaseType, null))) {
            op.returnTypeIsPrimitive = Boolean.valueOf(true);
          }
        }
        this.addHeaders(methodResponse, op.responseHeaders);
      }
    }
    final List<Parameter> parameters = operation.getParameters();
    CodegenParameter bodyParam = null;
    final List<CodegenParameter> allParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> bodyParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> pathParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> queryParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> headerParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> cookieParams = new ArrayList<CodegenParameter>();
    final List<CodegenParameter> formParams = new ArrayList<CodegenParameter>();
    boolean _notEquals_8 = (!Objects.equal(parameters, null));
    if (_notEquals_8) {
      for (final Parameter param : parameters) {
        {
          final CodegenParameter p = this.fromParameter(param, imports);
          if ((this.ensureUniqueParams).booleanValue()) {
            p.paramName = this.enforceUniqueParams(p, allParams);
          }
          allParams.add(p);
          if ((param instanceof QueryParameter)) {
            queryParams.add(p.copy());
          } else {
            if ((param instanceof PathParameter)) {
              pathParams.add(p.copy());
            } else {
              if ((param instanceof HeaderParameter)) {
                headerParams.add(p.copy());
              } else {
                if ((param instanceof CookieParameter)) {
                  cookieParams.add(p.copy());
                } else {
                  if ((param instanceof BodyParameter)) {
                    bodyParam = p;
                    bodyParams.add(p.copy());
                  } else {
                    if ((param instanceof FormParameter)) {
                      formParams.add(p.copy());
                    }
                  }
                }
              }
            }
          }
          if ((Objects.equal(p.required, null) || (!p.required))) {
            op.hasOptionalParams = Boolean.valueOf(true);
          }
        }
      }
    }
    for (final String i : imports) {
      boolean _needToImport = this.needToImport(i);
      if (_needToImport) {
        op.imports.add(i);
      }
    }
    op.bodyParam = bodyParam;
    op.httpMethod = httpMethod.toUpperCase();
    if ((this.sortParamsByRequiredFlag).booleanValue()) {
      Collections.<CodegenParameter>sort(allParams, new Comparator<CodegenParameter>() {
        // @Override
        @Override
        public int compare(final CodegenParameter one, final CodegenParameter another) {
          boolean oneRequired = false;
          boolean _notEquals = (!Objects.equal(one.required, null));
          if (_notEquals) {
            oneRequired = one.required;
          }
          boolean anotherRequired = false;
          boolean _notEquals_1 = (!Objects.equal(another.required, null));
          if (_notEquals_1) {
            anotherRequired = another.required;
          }
          if ((oneRequired == anotherRequired)) {
            return 0;
          } else {
            if (oneRequired) {
              return (-1);
            } else {
              return 1;
            }
          }
        }
      });
    }
    op.allParams = OpenbankingResteasyCodegen.addHasMore(allParams);
    op.bodyParams = OpenbankingResteasyCodegen.addHasMore(bodyParams);
    op.pathParams = OpenbankingResteasyCodegen.addHasMore(pathParams);
    op.queryParams = OpenbankingResteasyCodegen.addHasMore(queryParams);
    op.headerParams = OpenbankingResteasyCodegen.addHasMore(headerParams);
    op.formParams = OpenbankingResteasyCodegen.addHasMore(formParams);
    op.nickname = op.operationId;
    int _size_3 = op.allParams.size();
    boolean _greaterThan_2 = (_size_3 > 0);
    if (_greaterThan_2) {
      op.hasParams = Boolean.valueOf(true);
    }
    op.externalDocs = operation.getExternalDocs();
    op.isRestfulShow = Boolean.valueOf(op.isRestfulShow());
    op.isRestfulIndex = Boolean.valueOf(op.isRestfulIndex());
    op.isRestfulCreate = Boolean.valueOf(op.isRestfulCreate());
    op.isRestfulUpdate = Boolean.valueOf(op.isRestfulUpdate());
    op.isRestfulDestroy = Boolean.valueOf(op.isRestfulDestroy());
    op.isRestful = Boolean.valueOf(op.isRestful());
    op.path = this.sanitizePath(op.path);
    return op;
  }

  public String enforceUniqueParams(final CodegenParameter p,
      final List<CodegenParameter> allParams) {
    String _xblockexpression = null;
    {
      for (final CodegenParameter cp : allParams) {
        boolean _equals = p.paramName.equals(cp.paramName);
        if (_equals) {
          return OpenbankingResteasyCodegen.generateNextName(p.paramName);
        }
      }
      _xblockexpression = p.paramName;
    }
    return _xblockexpression;
  }

  private void addHeaders(final Response response, final List<CodegenProperty> target) {
    Map<String, Property> _headers = response.getHeaders();
    boolean _notEquals = (!Objects.equal(_headers, null));
    if (_notEquals) {
      Set<Map.Entry<String, Property>> _entrySet = response.getHeaders().entrySet();
      for (final Map.Entry<String, Property> headers : _entrySet) {
        target.add(this.fromProperty(headers.getKey(), headers.getValue()));
      }
    }
  }

  private static String generateNextName(final String name) {
    final Pattern pattern = Pattern.compile("\\d+\\z");
    final Matcher matcher = pattern.matcher(name);
    boolean _find = matcher.find();
    if (_find) {
      final String numStr = matcher.group();
      int _parseInt = Integer.parseInt(numStr);
      final int num = (_parseInt + 1);
      int _length = name.length();
      int _length_1 = numStr.length();
      int _minus = (_length - _length_1);
      String _substring = name.substring(0, _minus);
      return (_substring + Integer.valueOf(num));
    } else {
      return (name + "2");
    }
  }

  private static List<CodegenParameter> addHasMore(final List<CodegenParameter> objs) {
    boolean _notEquals = (!Objects.equal(objs, null));
    if (_notEquals) {
      for (int i = 0; (i < objs.size()); i++) {
        {
          if ((i > 0)) {
            CodegenParameter _get = objs.get(i);
            Boolean _boolean = new Boolean(true);
            _get.secondaryParam = _boolean;
          }
          int _size = objs.size();
          int _minus = (_size - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            CodegenParameter _get_1 = objs.get(i);
            Boolean _boolean_1 = new Boolean(true);
            _get_1.hasMore = _boolean_1;
          }
        }
      }
    }
    return objs;
  }

  private String sanitizePath(final String p) {
    return p.replaceAll("\'", "%22");
  }
}
