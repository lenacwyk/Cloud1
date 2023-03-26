package com.test.testcase1_2.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class TestBaseTestControl {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.navigate().to(ConfigReader.readProperty("testingControlsURL"));
    }
    @AfterMethod
    public void tearDown(){

        BrowserUtils.getScreenShot(driver,"testcase1_2");
        //driver.quit();
    }
}
