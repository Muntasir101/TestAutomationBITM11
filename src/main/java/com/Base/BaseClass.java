package com.Base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

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

    public static void capture_Screenshot(String imageName) throws IOException {
        //Step 1: Take Screenshot
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Step 2 and 3: Save image
        FileUtils.copyFile(SrcFile,new File("./Screenshots/"+imageName+".png"),true);
    }


}
