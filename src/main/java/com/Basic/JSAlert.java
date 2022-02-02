package com.Basic;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JSAlert extends BaseClass {

    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/javascript_alerts");
        normalAlert();
        confirmAlert();
        promptAlert();
        chrome_close();
    }
    public static void normalAlert() throws InterruptedException {
        WebElement alertBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alertBtn.click();
        custom_wait(4000);
        driver.switchTo().alert().accept(); //Click on "OK"
    }

    public static void confirmAlert() throws InterruptedException {
        WebElement alertBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        alertBtn.click();
        custom_wait(4000);
      //  driver.switchTo().alert().accept(); //Click on "OK"
        driver.switchTo().alert().dismiss();  //Click on "Cancel"
        custom_wait(2000);
    }

    public static void promptAlert() throws InterruptedException {
        WebElement alertBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        alertBtn.click();
        custom_wait(4000);
        driver.switchTo().alert().sendKeys("Test Automation");
        custom_wait(2000);
        driver.switchTo().alert().accept();
        custom_wait(4000);
    }

}
