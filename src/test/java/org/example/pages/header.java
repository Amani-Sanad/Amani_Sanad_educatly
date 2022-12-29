package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class header {
    public WebElement programs_btn ()
    {
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/programs\"])[1]"));
    }
    public WebElement dashboard_btn ()
    {
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/dashboard\"])[1]"));
    }
}
