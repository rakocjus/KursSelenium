package finalProject.task1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewAddressTest {

    UserPage userPage;
    LogInPage loginPage;
    AddressesPage addressesPage;
    NewAddressPage newAddressPage;
    private WebDriver driver;

    @Given("^User is logged in to CodersLab shop$")
    public void userIsLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        loginPage = new LogInPage(driver);
        loginPage.loginAs("testowy@testowy.de", "qwerty");
        loginPage.clickUsername();

    }

    @When("^User goes to NewAddressPage$")
    public void userGoesToNewAddressPage() {
        userPage = new UserPage(driver);
        userPage.goToAddresses();

    }

    @And("^User clicks Create new address$")
    public void userClicksCreateNewAddress() {
        addressesPage = new AddressesPage(driver);
        addressesPage.createNewAddress();

    }
    
    @And("^User fills the address form with ([^\"]*), ([^\"]*) ([^\"]*)$")
    public void userFillsTheAddressFormWithAddressCityPostcode(String address, String city, String postcode) {
        addressesPage = new AddressesPage(driver);
        newAddressPage.addAddress(address);
        newAddressPage.addCity(city);
        newAddressPage.addPostCode(postcode);

    }

    @And("^User saves changes$")
    public void userSavesChanges() {
        newAddressPage.saveAddress();

    }

    @Then("^User sees success message$")
    public void userSeesSuccessMessage(){
        Assert.assertTrue(addressesPage.getMessage().isDisplayed());
    }

    @And("^user confirms address data$")
    public void userConfirmsAddressData(String address) {
        Assert.assertTrue(addressesPage.verifyAddress(address));
    }

    @And("^User close chrome$")
    public void userCloseChrome() {
            driver.close();
        }

}
