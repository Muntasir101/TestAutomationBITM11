package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
   public static WebDriver driver; //driver=reference variable ; WebDriver=interface

    public static void main(String[] args) throws InterruptedException {
         chrome_launch();
         small_wait();
         chrome_close();
         small_wait();
         firefox_launch();
         small_wait();
         firefox_close();
    }

    public static void chrome_launch(){
        //Browser launch (Chrome)
        //dynamic path for browser driver(best)
          System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe"); //2 argument = key , value
         driver = new ChromeDriver();  //ChromeDriver=interface

        //static path for browser driver
        //System.setProperty("webdriver.chrome.driver","F:\\Training\\PeopleNTech\\BITM Online 11\\Tools\\chromedriver.exe");
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }

    public static void chrome_close(){
        driver.close();
    }
    public static void firefox_close(){
        driver.close();
    }

    public static void small_wait() throws InterruptedException {
        Thread.sleep(3000);
    }

}
