package bdd_wykład;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    public String keyword;
    WebDriver driver;

    @Given("an open browser with google.com")
    public void openGoogleSearch() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
         driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.google.com");}

    @When("^a keyword (.*) is entered in input field$")
    public void aKeywordKeywordIsEnteredInInputField(String kewyword) {
    }

    @Then("^the first one should contain (.*)$")
    public void theFirstOneShouldContainExpectedWord(String expectedText) {
        System.out.println(expectedText);
    }

    @And("^close google$")
    public void closeGoogle() {
    }

}
