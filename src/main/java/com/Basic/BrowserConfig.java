package com.Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
   public static WebDriver driver; //driver=reference variable ; WebDriver=interface

    public static void main(String[] args) throws InterruptedException {
         chrome_launch();
         open_website();
         get_title();
         get_url();
//         small_wait();
         chrome_close();

 //        firefox_launch();
//         open_website();
//         small_wait();
//         firefox_close();
    }

    public static void chrome_launch(){
        //Browser launch (Chrome)
        //dynamic path for browser driver(best)
         System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe"); //2 argument = key , value
         driver = new ChromeDriver();  //ChromeDriver=interface

        driver.manage().window().maximize();
        Dimension MaximizeWindowSize = driver.manage().window().getSize();
        System.out.println("Maximize Window Size: " +MaximizeWindowSize);

        driver.manage().window().setSize(new Dimension(800,400));
        Dimension SetWindowSize = driver.manage().window().getSize();
        System.out.println("New Set Window Size: " +SetWindowSize);

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

    public static void open_website(){
        driver.get("https://google.com");
    }

    public static void get_title(){
       String title = driver.getTitle();
        System.out.println("Title: "+ title);
    }
    public static void get_url(){
      String URL=  driver.getCurrentUrl();
        System.out.println("Current URL: "+URL);
    }

}
