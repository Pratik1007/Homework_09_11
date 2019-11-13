package com.xcart.demostore.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/* Created by Pratik */

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
