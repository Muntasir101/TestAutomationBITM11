package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DataDrivenLogin {
    public static WebDriver driver;

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

    @DataProvider(name = "LoginData_Invalid")
    public Object[][] data(){
        Object [][] data=new Object[3][2];

        //Data set 1
        data [0][0]="email1@mail.com";
        data [0][1]="1221331341";

        //Data set 2
        data [1][0]="email2@mail.com";
        data [1][1]="1221331341";

        //Data set 3
        data [2][0]="email3@mail.com";
        data [2][1]="1221331341";

        return data;
    }

    @Test(dataProvider = "LoginData_Invalid")
    public static void TC_invalid(String email,String pass) throws InterruptedException {
        WebElement Email= driver.findElement(By.name("email"));
        WebElement Pass=driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys(email);
        Pass.clear();
        Pass.sendKeys(pass);
        Thread.sleep(2000);
        LoginBtn.click();
    }

}
