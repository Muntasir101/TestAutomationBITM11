package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest2 {

    @BeforeClass
    public static void browser_config(){
        System.out.println("BeforeClass: Browser launched Successfully.");
    }

    @Test()
    public static void TC_003(){
        System.out.println("TestMethod: Test Case 003 Executed");
    }
    @Test()
    public static void TC_004(){
        System.out.println("TestMethod: Test Case 004 Executed");
    }

    @AfterClass
    public static void tear_down(){
        System.out.println("AfterClass: Browser Shut Down");
    }

}
