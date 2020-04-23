package bdd_wykład.myStore;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/mystore/",
        plugin = {"pretty","html:out"})

public class MyStoreRegistrationTest {
}
