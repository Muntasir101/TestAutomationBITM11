package com.Basic;

import com.Base.BaseClass;

public class BasicAuth extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        auth();
        chrome_close();
    }
    public static void auth() throws InterruptedException {
        //formula--> protocols://userName:password@url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        custom_wait(5000);
    }
}
