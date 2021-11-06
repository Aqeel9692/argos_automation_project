package org.Argos;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",tags = "@basket",strict = true,dryRun = false,plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
