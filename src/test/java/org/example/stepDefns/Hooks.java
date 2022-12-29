package org.example.stepDefns;

import Config.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Hooks {
    ConfigFileReader configFileReader= new ConfigFileReader();
    public static WebDriver driver = null;
    @Before
    public  void OpenBrowser() {
        // 1- Bridge
        System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
        // 2- create object from Chrome browser
        driver = new ChromeDriver();
        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
