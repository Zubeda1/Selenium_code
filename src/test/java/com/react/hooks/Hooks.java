package com.react.hooks;

import com.react.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.runOnChrome();
        driverManager.navigateTo();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}
