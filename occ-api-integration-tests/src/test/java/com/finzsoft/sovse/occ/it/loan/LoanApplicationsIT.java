package com.finzsoft.sovse.occ.it.loan;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import com.finzsoft.sovse.occ.MavenProperties;
import com.finzsoft.sovse.occ.it.AbstractIT;
import com.finzsoft.sovse.occ.it.OccJUnitPerfRule;
import com.finzsoft.sovse.occ.rest.loan.LoanApplicationsRestassured;
import com.github.noconnor.junitperf.JUnitPerfRule;
import com.github.noconnor.junitperf.JUnitPerfTest;
import com.github.noconnor.junitperf.JUnitPerfTestRequirement;
import com.github.noconnor.junitperf.reporting.providers.HtmlReportGenerator;
import io.qameta.allure.Description;

public class LoanApplicationsIT extends AbstractIT {

  private LoanApplicationsRestassured rest;

  @Rule
  public JUnitPerfRule perfTestRule = new OccJUnitPerfRule(
      new HtmlReportGenerator("target/docs/test-reports/perf/loan-applications-report.html"));

  @Before
  public void setup() {
    rest = new LoanApplicationsRestassured();
  }

  @Test
  @DisplayName("TODO: test_submit_loan_application")
  @Description("Response level set to medium while test getting application by external number "
      + "and validate the response does not contain financial details, securities and associated clients.")
  @JUnitPerfTest(threads = 1, durationMs = 15_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_submit_loan_application() {
    rest.submit_loan_application("loan/application-submission-creation-success.json");
    rest.assert_success();
  }
  
  @Test
  @DisplayName("Get application with medium response level.")
  @Description("Response level set to medium while test getting application by external number "
      + "and validate the response does not contain financial details, securities and associated clients.")
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_loan_application_medium() {
    rest.get_loan_application_by_externalNumber(MavenProperties.getExternalApplicationNumber());
    rest.assert_success();
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_success")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 125_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_success() {
    rest.get_changed_loan_applications_since("2019-10-28");
    rest.assert_success();
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_dateIsNull")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_dateIsNull() {
    rest.get_changed_loan_applications_since();
    rest.assert_status_bad_request();
    rest.assert_errors_not_null_or_empty();
    rest.assert_error_message_equals("Invalid date");
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_dateIsEmpty")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_dateIsEmpty() {
    rest.get_changed_loan_applications_since("");
    rest.assert_status_server_error();
    rest.assert_errors_not_null_or_empty();
    rest.assert_error_message_equals("Invalid date");
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_dateIsNotADate")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_dateIsNotADate() {
    rest.get_changed_loan_applications_since("Hello");
    rest.assert_status_server_error();
    rest.assert_errors_not_null_or_empty();
    rest.assert_error_message_equals("Invalid date");
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_dateIsNotIsoDate")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_dateIsNotIsoDate() {
    rest.get_changed_loan_applications_since("09.06.1986");
    rest.assert_status_server_error();
    rest.assert_errors_not_null_or_empty();
    rest.assert_error_message_equals("Invalid date");
  }

  @Test
  @DisplayName("TODO: test_get_changed_loan_applications_unrelatedOriginator")
  @Description
  @JUnitPerfTest(threads = 1, durationMs = 5_000, rampUpPeriodMs = 1_000, warmUpMs = 1_000,
      maxExecutionsPerSecond = 11_000)
  @JUnitPerfTestRequirement(percentiles = "90:7,95:7,98:7,99:8", executionsPerSec = 10_000,
      allowedErrorPercentage = 0.10f)
  public void test_get_changed_loan_applications_unrelatedOriginator() {
    rest.get_changed_loan_applications_since("2019-10-28");
    rest.assert_status_code_equals(200);
    rest.assert_data_not_null();
    rest.assert_data_empty();
    rest.assert_errors_null();
  }

}
