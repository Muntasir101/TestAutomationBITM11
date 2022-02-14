package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest2 extends TestBase {

    @BeforeClass
    @Parameters("BrowserName")
    public static void browserConfig(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/index.php?route=account/login");
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get("https://demo.opencart.com/index.php?route=account/login");
        }
        else {
            System.out.println("Please provide valid Browser like(Chrome or Firefox)");
        }
    }

    @AfterClass
    public static void close_Browser(){
        driver.close();
    }

    @Test(description = "Login test with InValid data")
    public static void TC_001(){
        typeElement_By_Name("email","user1013243242@gmail.com");
        typeElement_By_Name("password","123456ewrrwe");
        clickElement_By_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
    }
    @Test(description = "Login test with InValid data")
    public static void TC_002(){
        typeElement_By_Name("email","");
        typeElement_By_Name("password","123456ewrrwe");
        clickElement_By_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
    }
    @Test(description = "Login test with InValid data")
    public static void TC_003(){
        typeElement_By_Name("email","user1013mail.com");
        typeElement_By_Name("password","1234ewrrwe");
        clickElement_By_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
    }
    @Test(description = "Login test with InValid data")
    public static void TC_004(){
        typeElement_By_Name("email","il.com");
        typeElement_By_Name("password","");
        clickElement_By_Xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
    }

}
