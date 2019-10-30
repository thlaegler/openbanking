package com.finzsoft.sovse.occ.it;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import com.finzsoft.sovse.occ.MavenProperties;
import com.github.noconnor.junitperf.JUnitPerfRule;
import com.github.noconnor.junitperf.reporting.ReportGenerator;
import com.github.noconnor.junitperf.statistics.StatisticsCalculator;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class OccJUnitPerfRule extends JUnitPerfRule {

  public OccJUnitPerfRule() {
    super();
  }

  public OccJUnitPerfRule(ReportGenerator... reportGenerator) {
    super(reportGenerator);
  }

  public OccJUnitPerfRule(StatisticsCalculator statisticsCalculator) {
    super(statisticsCalculator);
  }

  public OccJUnitPerfRule(StatisticsCalculator statisticsCalculator,
      ReportGenerator... reportGenerator) {
    super(statisticsCalculator, reportGenerator);
  }

  @Override
  public Statement apply(Statement base, Description description) {
    if (MavenProperties.isPerfEnabled()) {
      log.debug("Performance test is enabled!");
      return super.apply(base, description);
    } else {
      log.warn("Performance test is disabled!");
      return base;
    }
  }

}
