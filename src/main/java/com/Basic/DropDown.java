package com.Basic;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_website("https://the-internet.herokuapp.com/dropdown");
        check_AllOptions();
        selectOptions();
        chrome_close();
    }
    public static void check_AllOptions(){
        WebElement dropDownEle= driver.findElement(By.id("dropdown"));
        Select dropDown=new Select(dropDownEle);

        List<WebElement> options=dropDown.getOptions();
        int size=options.size();
        System.out.println(size);
        for(int i=0; i<size;i++){
            String opt=options.get(i).getText();
            System.out.println(opt);
        }
    }

    public static void selectOptions(){
        WebElement dropDownEle= driver.findElement(By.id("dropdown"));
        Select dropDown=new Select(dropDownEle);

      //  dropDown.selectByValue("1");
      //  dropDown.selectByVisibleText("Option 2");
        dropDown.selectByIndex(1);
    }

}
