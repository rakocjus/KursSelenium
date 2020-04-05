package bdd_wykład.myHotel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class myHotelregistration {

    WebDriver driver;

    @Given("^an open browser with https://qloapps\\.coderslab\\.pl/$")
    public void anOpenBrowserWithHttpsQloappsCoderslabPl() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        driver.get("https://qloapps.coderslab.pl/en/");

    }

    @When("^user clicks sign in button$")
    public void userClicksSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
    }

    @And("^enters emailAddress and clicks Create an account button$")
    public void entersEmailAddressAndClicksCreateAnAccountButton() {
        driver.findElement(By.name("email_create")).sendKeys("testowanie@test.pl");
        driver.findElement(By.id("SubmitCreate")).click();
    }

    //@And("^user chooses Title$")
    //public void userChoosesTitle() {
        //List<WebElement> titleList = driver.findElements(By.className("radio-inline"));
        //titleList.get(0).click();
    //}

    @And("^user fills firstName, lastName and password$")
    public void userFillsFirstNameLastNameAndPassword() {
        try {
            Thread.sleep(2000);
        }
            catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("customer_firstname")).sendKeys("Jan");
        driver.findElement(By.id("customer_lastname")).sendKeys("Kowalski");
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
    }

    @And("^user chooses Date of birth$")
    public void userChoosesDateOfBirth() {
        Select day = new Select(driver.findElement(By.id("days")));
        day.selectByValue("3");

        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByValue("3");

        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByValue("1978");
    }

    @And("^user clicks Register button$")
    public void userClicksRegisterButton() {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^Your account has been created message appears$")
    public void yourAccountHasBeenCreatedMessageAppears() {
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));

        Assert.assertEquals("Your account has been created.", successMessage.getText());
    }
    @And("^close google$")
    public void closeGoogle() {
    }

}
