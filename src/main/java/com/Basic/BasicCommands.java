package com.Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BasicCommands {

   public static WebDriver driver;

    public static void main(String[] args) {

    }
 //open URL
 public static void openUrl(){
       // get(string)
       //get("https://google.com)
 }

    //Type on input/text field
    public static void type(){
     // sendKeys(" ") // sendKeys("email@gmail.com");
    }
 public static void click(){
  //   driver.click()
 }

public static void maximize_window(){
        //Option 1
        driver.manage().window().maximize();

        //Option 2
        WebDriver.Options manage=driver.manage();
        WebDriver.Window win=manage.window();
        win.maximize();
}

  public static void get_Window_size(){
      Dimension MaximizeWindowSize = driver.manage().window().getSize();
      System.out.println(MaximizeWindowSize);
  }

  public static void set_Window_size(){
        driver.manage().window().setSize(new Dimension(800,400));
  }

  public static void get_title(){
        driver.getTitle();
  }
  public static void get_url(){
        driver.getCurrentUrl();
    }

    public static void navigate_to(){
        driver.navigate().to("");
    }
    public static void navigate_back(){
        driver.navigate().back();
    }
    public static void navigate_forward(){
        driver.navigate().forward();
    }
    public static void navigate_refresh(){
        driver.navigate().refresh();
    }


}
