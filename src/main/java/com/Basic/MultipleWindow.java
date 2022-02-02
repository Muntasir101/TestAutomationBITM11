package com.Basic;

import com.Base.BaseClass;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindow extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/windows");
        switchTab();
        chrome_quit();
    }
    public static void switchTab() throws InterruptedException {
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> tabNumber= driver.getWindowHandles();
        Iterator<String> it= tabNumber.iterator();

        String parentWindow=it.next();
        String childWindow=it.next();

        //Switching to parent
        driver.switchTo().window(parentWindow);
        driver.navigate().to("https://google.com");
        custom_wait(3000);

        //Switching to Child
        driver.switchTo().window(childWindow);
        driver.navigate().to("https://apple.com");
        custom_wait(3000);

        //Switching to parent
        driver.switchTo().window(parentWindow);
        driver.navigate().to("https://bbc.com");
        custom_wait(3000);
    }
}
