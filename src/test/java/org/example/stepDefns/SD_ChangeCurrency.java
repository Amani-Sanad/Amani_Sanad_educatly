package org.example.stepDefns;
import Config.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.programsPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class SD_ChangeCurrency {
    SoftAssert soft = new SoftAssert();
    ConfigFileReader configFileReader= new ConfigFileReader();
    programsPage ProgramsPage = new programsPage();
    @Given("User goes to  programs page")
    public void goRegisterPage()
    {
   Hooks.driver.get("https://www.educatly.com/programs");
    }

    @And("User select tuition fees filter")
    public void userSelectTuitionFeesFilter() {
        ProgramsPage.cookies_btn().click();
        ProgramsPage.tuitionFees_filter().click();
    }

    @And("User clicks on Change Currency")
    public void userClicksOnChangeCurrency() throws InterruptedException {
        ProgramsPage.changeCurrency_btn().click();
        ProgramsPage.currency_list().click();
        Thread.sleep(3000);
    }

    @And("User selects EUR from currency list")
    public void userSelectsEURFromCurrencyList() {
        ProgramsPage.currency_EUR().click();
    }
    @When("User save changes")
    public void Usersavechanges()  {
        ProgramsPage.savechanges_btn().click();
    }

    @Then("currency is changed to Euro in the programs listing")
    public void currencyIsChangedToEuroInTheProgramsListing() {
       String currency = ProgramsPage.currency_div().get(1).getText();
        System.out.println("Program currency : " + currency );
        soft.assertTrue(currency.contains("EUR"));
    }

    @And("currency is changed to Euro in program details screen")
    public void currencyIsChangedToEuroInProgramDetailsScreen() {
        ProgramsPage.moreDetails_btn().get(1).click();
        String Currency =ProgramsPage.tuitionCurrency().getText();
        System.out.println("More Details currency : " + Currency );
        Assert.assertTrue(Currency.contains("EUR"));
    }


}

