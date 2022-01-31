package com.Guru99.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserLoginTest {

    public static WebDriver driver;

    public static void main(String[] args) {
        firefox_launch();
        open_website();
       // manager_login_valid();
        manager_login_Invalid();
    }

    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }

    public static void open_website(){
        driver.get("https://demo.guru99.com/V4/index.php");
    }

    //Test case 01
    public static void manager_login_valid(){
       //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("mngr382713");
        Password.sendKeys("dugasAb");
        LoginBtn.click();

    }

    //Test case 02
    public static void manager_login_Invalid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("asdasd");
        Password.sendKeys("21133");
        LoginBtn.click();
    }

    //Test case 03
    public static void customer_login_valid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("");
        Password.sendKeys("");
        LoginBtn.click();
    }

    //Test case 04
    public static void customer_login_Invalid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("");
        Password.sendKeys("");
        LoginBtn.click();
    }
}
