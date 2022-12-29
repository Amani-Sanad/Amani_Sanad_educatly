package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class progDetailsPage {
    public WebElement favorite_icon ()
    {
        return Hooks.driver.findElement(By.className("styles_header__start__title__favourite__1CQn3"));
    }
    public WebElement programName_div()
    {
       return Hooks.driver.findElement(By.xpath("//div[@class=\"styles_header__start__title__2DK2z\"]"));
    }
    public String programName_txt ()
    {
        return programName_div().getText();
    }

}
