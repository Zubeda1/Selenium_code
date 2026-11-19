package com.react.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/search.feature",
        glue = {"com.react.steps", "com.react.hooks"},
        dryRun = false,
        tags = "@smoke"
)
public class RunCukesTest {
}
