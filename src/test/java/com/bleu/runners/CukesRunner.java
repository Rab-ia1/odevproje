package com.bleu.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin ={"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/bleu/step_definitions",dryRun = false

)
public class CukesRunner {
    private String json;
}