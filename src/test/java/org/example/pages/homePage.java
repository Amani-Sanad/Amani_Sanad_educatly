package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage {
    public WebElement login_btn ()
    {
        return Hooks.driver.findElement(By.className("styles_navbar__body__end__login__V69xt"));
    }
}
