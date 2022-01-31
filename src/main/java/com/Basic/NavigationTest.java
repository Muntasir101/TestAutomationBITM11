package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
    public static WebDriver driver;

    public static void main(String[] args) {

        firefox_launch();
        open_website();
        navigate_to();
        navigate_back();
        navigate_forward();
        firefox_close();
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }
    public static void open_website(){
        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println("Base Title : "+title); //Google
    }
    public static void firefox_close(){ driver.close();}

    public static void navigate_to(){
        driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
        String title=driver.getTitle();
        System.out.println("Navigate to : "+title); //Account Login
    }
    public static void navigate_back(){
        driver.navigate().back();
        String title=driver.getTitle();
        System.out.println("After Navigate back Title: "+title); //Google
    }

    public static void navigate_forward(){
        driver.navigate().forward();
        String title=driver.getTitle();
        System.out.println("After Navigate forward Title: "+title); //Account Login
    }

}
