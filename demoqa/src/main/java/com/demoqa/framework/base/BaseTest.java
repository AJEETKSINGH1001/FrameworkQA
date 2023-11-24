package com.demoqa.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demoqa.framework.utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfigReader.getChromeDriverPath());
        // Initialize other WebDriver properties as needed
    }
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
         //   driver.quit();
        }
    }
}
