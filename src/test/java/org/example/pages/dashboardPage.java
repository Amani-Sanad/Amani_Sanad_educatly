package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dashboardPage {
    public WebElement favorite_btn ()
    {
        return Hooks.driver.findElement(By.xpath("(//*[contains(@class,'styles_tabs')])[7]"));
    }
    public WebElement cookies_btn ()
    {
        return Hooks.driver.findElement(By.className("styles_cookiePolicyContainer__policyBottom__acceptBtn__1DpSi"));
    }
    public List<WebElement> favorites_titles()
    {
        return Hooks.driver.findElements(By.xpath("//div[@class='styles_double__programCard__topSection__title__fieldOfStudy__2Kc2I']"));
    }
    public String favorites_titles_txt ()
    {
        return favorites_titles().get(0).getText();
    }
}
