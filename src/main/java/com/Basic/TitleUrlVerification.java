package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleUrlVerification {
    public static WebDriver driver;

    public static void main(String[] args) {
        firefox_launch();
        open_website();
        title_test();
        url_test();
        firefox_close();
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }

    public static void open_website(){
        driver.get("https://google.com");
    }

    //Title Verification
    public static void title_test(){
        String Expected_title="gooGlE";
        String Actual_title= driver.getTitle();

        if(Expected_title.equals(Actual_title)){
            System.out.println("Title Matched.Test passed");
        }
        else {
            System.out.println("Title Mis-Matched.Test failed");
        }
    }

    //Url Verification
    public static void url_test(){
        String Expected_url="https://google";
        String Actual_url= driver.getCurrentUrl();

        if(Expected_url.equals(Actual_url)){
            System.out.println("URL Matched.Test passed");
        }
        else {
            System.out.println("URL Mis-Matched.Test failed");
        }
    }
    public static void firefox_close(){
        driver.close();
    }
}
