package com.Basic;

import com.Base.BaseClass;

import java.io.IOException;

public class BasicAuth extends BaseClass {
    public static void main(String[] args) throws InterruptedException, IOException {
        chrome_launch();
        auth();
        chrome_close();
    }
    public static void auth() throws InterruptedException, IOException {
        //formula--> protocols://userName:password@url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        custom_wait(5000);
        capture_Screenshot("BasicAuth");
    }
}
