package ExtentReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class ExtentLogin {

    public static WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports reports;
    public static ExtentTest test;

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
        //Implement Extent Report
        htmlReporter = new ExtentHtmlReporter("./ExtentReports/LoginTest.html");
        reports =new ExtentReports();
        reports.attachReporter(htmlReporter);

        // Information add to Report
        reports.setSystemInfo("Project Mame","OpenCart");
        reports.setSystemInfo("Project Module","Login");
        reports.setSystemInfo("Environment","Test");
        reports.setSystemInfo("Tester Name","Muntasir");

        test=reports.createTest("Login Test");

        WebElement Email= driver.findElement(By.name("email"));
        WebElement Pass=driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.sendKeys("user101@gmail.com");
        test.log(Status.INFO,"Email Type done");
        Pass.sendKeys("123456");
        test.log(Status.INFO,"Password Type done");
        LoginBtn.click();
        test.log(Status.INFO,"Click Login");

        test.log(Status.PASS,"Test Case Executed Successfully.");

        reports.flush();
    }


    @AfterClass
    public static void tear_down(){
        driver.close();
    }

}
