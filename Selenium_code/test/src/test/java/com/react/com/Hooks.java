package com.react.com;

import driver.DriverManager;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    private DriverManager drivermanger = new DriverManager();

    @Before
    public  void  setUp(){
        drivermanger.runOnChrome();
        drivermanger.navigateTo();
        drivermanger.applyimplicitwait();
    }
    @After
    public void tearDown(){
        drivermanger.closeBrowser();
    }
}

