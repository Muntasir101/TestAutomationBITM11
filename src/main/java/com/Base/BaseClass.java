package com.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Parent Class
public class BaseClass {
    public static WebDriver driver;

    //Chrome Launch
    public static void chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe"); //2 argument = key , value
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    //Chrome Close
    public static void chrome_close(){
        driver.close();
    }

    //quit chrome
    public static void chrome_quit(){
        driver.quit();
    }

    //Firefox launch
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }
    //Firefox Close
    public static void firefox_close(){
        driver.close();
    }

    //Website Open
    public static void open_website(String URL){
        driver.get(URL);
    }

    //Custom wait
    public static void custom_wait(int milliSeconds) throws InterruptedException {
        Thread.sleep(milliSeconds);
    }



}
