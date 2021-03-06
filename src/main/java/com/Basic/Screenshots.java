package com.Basic;

import com.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class Screenshots extends BaseClass {
    public static void main(String[] args) throws IOException {
        chrome_launch();
        open_website("https://google.com");
        capture_Screenshot();
        chrome_close();

    }
    public static void capture_Screenshot() throws IOException {
        //Step 1: Take Screenshot
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Step 2 and 3: Save image
        FileUtils.copyFile(SrcFile,new File("./Screenshots/Image1.png"),true);
    }

}
