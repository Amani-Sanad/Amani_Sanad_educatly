package org.example.pages;

import org.example.stepDefns.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class programsPage extends dashboardPage {

    public List<WebElement> moreDetails_btn()
    {
        return Hooks.driver.findElements(By.xpath("//div[@class='styles_resultCard__end__buttons__check__2COS0']"));
    }
    public WebElement tuitionFees_filter()
    {
        return Hooks.driver.findElement(By.xpath("(//div[@class='ant-collapse-header'])[8]"));
    }
    public WebElement changeCurrency_btn()
    {
        return Hooks.driver.findElement(By.xpath("(//div[@class='styles_currencyBtn__1hbgM'])[1]"));
    }
    public WebElement currency_list()
    {
        return Hooks.driver.findElement(By.xpath("(//input[@id='currency'])[1]"));
    }
    public WebElement currency_EUR()
    {
        return Hooks.driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]"));
    }
    public WebElement savechanges_btn()
    {
    return Hooks.driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/button[2]"));

    }
    public List<WebElement> currency_div()
    {
        return Hooks.driver.findElements(By.xpath("//div[@class=\"styles_resultCard__start__top__tuition__3FgBN\"]"));
    }
    public  WebElement tuitionCurrency()
    {
        return Hooks.driver.findElement(By.xpath("(//div[@class=\"styles_snippet__info__end__desc__2Qdtq\"])[1]"));
    }
}
