package com.laegler.openbanking.codegen.module;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenbankingDefinitionCodegen extends OpenbankingBaseCodegen {

  @Override
  public String getName() {
    return "openbanking-definition";
  }

  public OpenbankingDefinitionCodegen() {
    super();
    embeddedTemplateDir = templateDir = "openbankingDefinition";
  }

  @Override
  public void processOpts() {
    super.processOpts();

    supportingFiles.clear();

    apiTemplateFiles.remove("apiController.mustache");
    // apiTemplateFiles.clear();
    apiTestTemplateFiles.clear();
    apiDocTemplateFiles.clear();
    modelTemplateFiles.clear();
    modelTestTemplateFiles.clear();
    modelDocTemplateFiles.clear();

    apiFeatureStepsTemplateFiles.clear();
    apiIntegrationTestTemplateFiles.clear();

    // apiTemplateFiles.put("api.mustache", // the template to use
    // ".jmx"); // the extension for each file to write
    //
    // apiTemplateFiles.put("testdata-localhost.mustache", ".csv");
  }

}
