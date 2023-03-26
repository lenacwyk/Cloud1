package com.test.testcase1_2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){ //constructor

        PageFactory.initElements(driver,this);
    }
    @FindBy (css = "#countriesSingle")
    WebElement countryBox;
}
