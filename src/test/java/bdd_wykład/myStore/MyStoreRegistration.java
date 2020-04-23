package bdd_wykład.myStore;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreRegistration {

    WebDriver driver;

    @Given("^an open browser with https://prod-kurs.coderslab.pl/index.php$")
    public void anOpenBrowserWithHttpsProdKursCoderslabPlIndexPhp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @When("^user clicks Sign in button$")
    public void userClicksSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
    }

    @And("^user clicks No account\\? Create one here link$")
    public void userClicksNoAccountCreateOneHereLink() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div")).click();
    }

    //@And("^user chooses Social title$")
    //public void userChoosesSocialTitle() {
        //Select title = new Select(driver.findElement(By.name("id_gender")));
        //title.selectByValue("1");

    @And("^user fills firstName, lastName emailAddress and password$")
    public void userFillsFirstNameLastNameEmailAddressAndPassword() {
        driver.findElement(By.name("firstname")).sendKeys("Joanna");
        driver.findElement(By.name("lastname")).sendKeys("Darc");
        driver.findElement(By.name("email")).sendKeys("testsklep@test.com");
        driver.findElement(By.name("password")).sendKeys("qwerty");
    }

    @And("^user choose Date of birth$")
    public void userChooseDateOfBirth() {
        driver.findElement(By.name("birthday")).sendKeys("05/31/1970");
    }

    @And("^user clicks Save button$")
    public void userClicksSaveButton() {
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();
    }

    @Then("^Home page is displayed$")
    public void homePageIsDisplayed() {
                driver.findElement(By.xpath("//*[@id='_desktop_user_info']/div/a[2]/span"));
    }

    @And("^close google page$")
    public void closeGooglePage() {
    }

}
