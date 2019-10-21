package com.laegler.openbanking.codegen.module;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenbankingSoapCodegen extends OpenbankingBaseCodegen {

  @Override
  public String getName() {
    return "openbanking-soap";
  }

  public OpenbankingSoapCodegen() {
    super();
    embeddedTemplateDir = templateDir = "openbankingSoap";
  }

  @Override
  public void processOpts() {
    super.processOpts();

    supportingFiles.clear();

    apiTemplateFiles.clear();
    apiTestTemplateFiles.clear();
    apiDocTemplateFiles.clear();
    modelTemplateFiles.clear();
    modelTestTemplateFiles.clear();
    modelDocTemplateFiles.clear();

    apiFeatureStepsTemplateFiles.clear();
    apiIntegrationTestTemplateFiles.clear();

    // supportingFiles.add(new SupportingFile("selectTransformSoapFrom.mustache", folder,
    // destinationFilename)

    resourceTemplateFiles.put("selectTransformSoapFrom.mustache", ".json");
    resourceTemplateFiles.put("selectTransformSoapTo.mustache", ".json");
  }

}
