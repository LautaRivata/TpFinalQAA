package com.Tupak.opencart.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.Tupak.opencart.stepDefinitions", "com.Tupak.opencart.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE//,
        //tags = "@CAR-0001"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
