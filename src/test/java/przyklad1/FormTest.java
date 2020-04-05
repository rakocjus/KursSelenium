package przyklad1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FormTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();


        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do odpowiedniego URL
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
            public void fillInputFormTest() {
            // Arrange
            driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

    // Act
    WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        firstName.sendKeys("Karol");

    WebElement secondName = driver.findElement(By.id("last-name"));
        secondName.clear();
        secondName.sendKeys("Kowalski");

    List<WebElement> genders = driver.findElements(By.className("radio-inline"));

        for (int i = 0; i < genders.size(); ++i) {
        WebElement genderCandidate = genders.get(i);
        String genderText = genderCandidate.getText();
        if (genderText.equals("In Between"))
            genderCandidate.click();
    }

    WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.clear();
        dateOfBirth.sendKeys("05/22/2010");

    WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");

    WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("karol.kowalski@mailinator.com");

    WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

    WebElement company = driver.findElement(By.id("company"));
        company.clear();
        company.sendKeys("Coders Lab");

    WebElement role = driver.findElement(By.id("role"));
    Select roleDropdown = new Select(role);
        roleDropdown.selectByVisibleText("QA");

    Select expectations = new Select(driver.findElement(By.id("expectation")));
        expectations.selectByVisibleText("Good teamwork");
        expectations.selectByVisibleText("Challenging");

    List<String> waysToChoose = new ArrayList<>();
        waysToChoose.add("Take online courses");
        waysToChoose.add("Join tech cons");
        waysToChoose.add("Via discovery and experiment");
    List<WebElement> waysOfDevelopment = driver.findElements(
            By.cssSelector(".checkbox label")
    );
        for (WebElement checkbox: waysOfDevelopment
             ) {
        String text = checkbox.getText();
        if (waysToChoose.contains(text))
            checkbox.click();
    }

    WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

    WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

    // Assert
    WebElement successMessage = driver.findElement(By.id("submit-msg"));
        Assert.assertEquals("Successfully submitted!",
                successMessage.getText());
}

    @After
    public void cokolwiek() {
        driver.quit();
    }
}
