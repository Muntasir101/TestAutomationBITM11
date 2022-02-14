package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TestBase {

 public static WebDriver driver;

 public static void launch_Browser(String browserName){
     if(browserName.equalsIgnoreCase("chrome")){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
     }
     else if(browserName.equalsIgnoreCase("firefox")){
         WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();
     }
     else if (browserName.equalsIgnoreCase("edge")){
         System.setProperty("webdriver.edge.driver","./src/main/resources/edgedriver.exe");
         driver=new EdgeDriver();
     }
     else if (browserName.equalsIgnoreCase("opera")){

     }
     else {
         System.out.println("Please provide valid Browser like(Chrome or Firefox)");
     }
 }

 //Close Browser
 public static void closeBrowser(String browserName){
     if(browserName.equalsIgnoreCase("chrome")){
         driver.close();
     }
     if(browserName.equalsIgnoreCase("firefox")){
         driver.close();
     }
     else {
         System.out.println("Your Given Browser name is not Running. So nothing to close.");
     }
 }

 // Quit Browser
 public static void quitBrowser(String browserName){
     if(browserName.equalsIgnoreCase("chrome")){
         driver.quit();
     }
     if(browserName.equalsIgnoreCase("firefox")){
         driver.quit();
     }
     else {
         System.out.println("Your Given Browser name is not Running. So nothing to close.");
     }
 }

    //Website Open open_website("http://")
    public static void open_website(String URL){
        if(URL==null){
            System.out.println("URL is NULL, Please provide valid URL");
        }
        if(URL.indexOf("http")==-1){
            System.out.println("HTTP missing, Please add HTTP in URL");
        }
        driver.get(URL);
    }

    //Custom wait
    public static void custom_wait(int milliSeconds) throws InterruptedException {
        Thread.sleep(milliSeconds);
    }
    //Screenshot
    public static void capture_Screenshot(String imageName) throws IOException {
        //Step 1: Take Screenshot
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Step 2 and 3: Save image
        FileUtils.copyFile(SrcFile,new File("./Screenshots/"+imageName+".png"),true);
    }
    // Click
    public static void clickElement_By_Id(String ID){
        driver.findElement(By.id(ID)).click();
    }
    public static void clickElement_By_Name(String Name){
        driver.findElement(By.name(Name)).click();
    }
    public static void clickElement_By_Xpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
    public static void clickElement_By_CSS(String CSS){
        driver.findElement(By.cssSelector(CSS)).click();
    }

    // Clear
    public static void clearElement_By_Id(String ID){
        driver.findElement(By.id(ID)).clear();
    }
    public static void clearElement_By_Name(String Name){
        driver.findElement(By.name(Name)).clear();
    }
    public static void clearElement_By_Xpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).clear();
    }
    public static void clearElement_By_CSS(String CSS){
        driver.findElement(By.cssSelector(CSS)).clear();
    }
    // Type
    public static void typeElement_By_Id(String ID,String Text){
        driver.findElement(By.id(ID)).sendKeys(Text);
    }
    public static void typeElement_By_Name(String Name,String Text){
        driver.findElement(By.name(Name)).sendKeys(Text);
    }
    public static void typeElement_By_Xpath(String Xpath,String Text){
        driver.findElement(By.xpath(Xpath)).sendKeys(Text);
    }
    public static void typeElement_By_CSS(String Css,String Text){
        driver.findElement(By.cssSelector(Css)).sendKeys(Text);
    }

    //Alert
    public static void alertAccept(){
        driver.switchTo().alert().accept();
    }
    public static void alertCancel(){
        driver.switchTo().alert().dismiss();
    }



}
