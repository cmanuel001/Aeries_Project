package com.aeriesparentportal.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)         // calls on Cucumber
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",//stores failed scenario names into rerun.txt file
                "json:target/cucumber-html-reports/cucumber.json"  //generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/aeriesparentportal/StepDefs/",
        dryRun = true,
        publish = true
        //false=> run the test. true => checks for missing steps
        // true = will fail a scenario
)
public class CukesRunner {
}
