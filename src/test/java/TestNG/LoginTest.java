package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class LoginTest {
    public static WebDriver driver;

    @BeforeClass
    public static void browser_config(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe"); //2 argument = key , value
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public static void openWebsite(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    @AfterMethod
    public static void screenshot() throws IOException {
        //Step 1: Take Screenshot
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Step 2 and 3: Save image
        FileUtils.copyFile(SrcFile,new File("./Screenshots/TestNG1.png"));

    }
    @Test(description = "Login test with Valid data")
    public static void TC_001(){
        WebElement Email= driver.findElement(By.name("email"));
        WebElement Pass=driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.sendKeys("user101@gmail.com");
        Pass.sendKeys("123456");
        LoginBtn.click();
    }
    

    @AfterClass
    public static void tear_down(){
        driver.close();
    }

}
