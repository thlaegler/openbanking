package com.finzsoft.sovse.occ.it.attachment;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import com.finzsoft.sovse.occ.it.AbstractIT;
import com.finzsoft.sovse.occ.it.OccJUnitPerfRule;
import com.finzsoft.sovse.occ.rest.attachment.AttachmentsRestassured;
import com.github.noconnor.junitperf.JUnitPerfRule;
import com.github.noconnor.junitperf.JUnitPerfTest;
import com.github.noconnor.junitperf.JUnitPerfTestRequirement;
import com.github.noconnor.junitperf.reporting.providers.HtmlReportGenerator;
import io.qameta.allure.Description;

public class AttachmentIT extends AbstractIT {

  private AttachmentsRestassured rest;

  @Rule
  public JUnitPerfRule perfTestRule = new OccJUnitPerfRule(
      new HtmlReportGenerator("target/docs/test-reports/perf/attachments-report.html"));

  @Before
  public void setup() {
    rest = new AttachmentsRestassured();
  }

  @Test
  @DisplayName("TODO: test_upload_file_success")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_upload_file_success() {
    rest.upload_attachement("attachments/test_file.pdf");
    rest.assert_success();
  }

}
