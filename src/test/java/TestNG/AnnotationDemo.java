package TestNG;

import org.testng.annotations.*;

public class AnnotationDemo {

    @BeforeClass
    public static void browser_config(){
        System.out.println("BeforeClass: Browser launched Successfully.");
    }

//    @BeforeMethod
//    public static void openWebsite(){
//        System.out.println("BeforeMethod: Test URL Successfully Open");
//    }
//    @AfterMethod
//    public static void screenshot(){
//        System.out.println("AfterMethod: Screenshot Captured and test done.");
//    }

    @Test(priority = 2,description = "This test case is for valid Scenario")
    public static void TC_001(){
        System.out.println("TestMethod: Test Case 001 Executed");
    }
    @Test(priority = 3,description = "This test case is for Invalid Scenario")
    public static void TC_002(){
        System.out.println("TestMethod: Test Case 002 Executed");
    }
    @Test(enabled = false,priority = 1)
    public static void TC_003(){
        System.out.println("TestMethod: Test Case 003 Executed");
    }

    @AfterClass
    public static void tear_down(){
        System.out.println("AfterClass: Browser Shut Down");
    }

}
