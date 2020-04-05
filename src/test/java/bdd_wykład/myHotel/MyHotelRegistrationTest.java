package bdd_wykład.myHotel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/myhotel/",
        plugin = {"pretty","html:out"})

public class MyHotelRegistrationTest {
}
