package com.react.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/search.feature",dryRun = false,tags ="@smoke")
public class RunCukesTest {
}
