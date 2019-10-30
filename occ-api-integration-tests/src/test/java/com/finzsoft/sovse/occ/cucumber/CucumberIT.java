package com.finzsoft.sovse.occ.cucumber;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = false, //
    // stepNotifications = true,
    // tags = {"@tag1"},
    glue = {"com.finzsoft.sovse.occ.cucumber.steps"}, features = {"src/test/resources/features"},
    plugin = {"pretty", "html:target/docs/test-reports/cucumber",
        "json:target/docs/test-results/cucumber.json",
        "junit:target/docs/test-results/cucumber.xml",
    // "features.OpenbankingCucumberFormatter:../openbanking-api-docs/test-reports/cucumber-extent.html",
    // "com.cucumber.listener.ExtentCucumberFormatter:../openbanking-api-docs/test-reports/cucumber-extent.html",
    // "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:../openbanking-api-docs/test-reports/cucumber-extent.html"
    })
public class CucumberIT {

  @BeforeClass
  public static void beforeTestClass() {
    log.info("Before Test Class");

    OpenbankingCucumberProperties extentProperties = OpenbankingCucumberProperties.INSTANCE;
    extentProperties.setReportPath("target/docs/test-reports/cucumber-extent.html");
    // extentProperties.setExtentXServerUrl("http://localhost:1337");
    extentProperties.setProjectName("OCC API");
  }

  @Before
  public void beforeTest() {
    log.info("Before Test Case");
  }
}
