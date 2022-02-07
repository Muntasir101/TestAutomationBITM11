package com.Basic;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrames extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/iframe");
        iFrameTest();
        chrome_close();
    }
    public static void iFrameTest() throws InterruptedException {
        //Locate iFrame
        driver.switchTo().frame("mce_0_ifr");
        WebElement iFrameBody= driver.findElement(By.id("tinymce"));
        custom_wait(2000);
        iFrameBody.clear();
        custom_wait(2000);
        iFrameBody.sendKeys("Test Automation.");
    }
}
