package com.aeriesparentportal.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)         // calls on Cucumber
@CucumberOptions(
        plugin =  {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/aeriesparentportal/StepDefs",
        tags = "@smoke",
        dryRun = false                                 // true = will fail a scenario
)
public class CukesRunner {
}
