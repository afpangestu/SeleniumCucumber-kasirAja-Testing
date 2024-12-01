package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps {
    WebDriver driver;

    @Given("User open Login page in the Browser")
    public void user_open_login_page_in_the_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Testing//drivers//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kasirdemo.vercel.app/login");
        // full window
        driver.manage().window().maximize();
    }

    @When("The login page is displayed")
    public void the_login_page_is_displayed() {
        boolean status = driver.findElement(By.xpath("//div[@class='css-16in75i']")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("User input email and password")
    public void user_input_email_and_password() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abah@mail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("030123");

    }

    @And("User click Login button")
    public void user_click_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User redirected to Dashboard page")
    public void user_redirected_to_dashboard_page() throws InterruptedException {
        Thread.sleep(5000); // delay 5 detik
        driver.quit();
    }
}
