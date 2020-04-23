package finalProject.task1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/ChangeUserInformation/add-user-address.feature",
            plugin = {"pretty", "html:out"})

    public class AddNewAddressTest {
}

