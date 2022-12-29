package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement email_field ()
    {
        return Hooks.driver.findElement(By.id("login_email"));
    }
    public WebElement password_field ()
    {
        return Hooks.driver.findElement(By.id("login_password"));
    }
    public WebElement login_btn ()
    {
        return Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }
}
