package Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
    WebDriver driver;

    @Given("I launch Chrome Browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Launch Chrome Successfully.");
    }
    @When("I open Opencart Login page")
    public void i_open_opencart_login_page() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        System.out.println("Open Login page");
    }
    @And("I Enter Email and I enter Password and click Login")
    public void i_enter_email_and_i_enter_password_and_click_login() throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        WebElement Pass=driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys("invalid@com");
        Pass.clear();
        Pass.sendKeys("asasssad");
        Thread.sleep(2000);
        LoginBtn.click();
        System.out.println("Enter Email and password");
    }
    @Then("Error message display and close Browser")
    public void error_message_display_and_close_browser() {
        String ErrorMessage=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
        System.out.println("Error Message for Email and password is "+ErrorMessage);
        driver.close();
        System.out.println("Browser Closed.");
    }
}
