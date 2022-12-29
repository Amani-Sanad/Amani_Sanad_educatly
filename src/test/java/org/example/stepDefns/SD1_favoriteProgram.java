package org.example.stepDefns;

import Config.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.testng.Assert;

public class SD1_favoriteProgram {
    ConfigFileReader configFileReader= new ConfigFileReader();
    homePage Home_Page = new homePage();
    loginPage Login_Page = new loginPage();
    programsPage ProgramsPage = new programsPage();
    header Header = new header();
    progDetailsPage progDetailsPage = new progDetailsPage();
    dashboardPage DashboardPage = new dashboardPage();
    public String getprogramName_txt; // global variable to store the text to use in another step
    @Given("User logged in successfully")
   public void userLogin(){
    // 4- navigate to homepage
    Hooks.driver.get(configFileReader.getEducatlyUrl());
    Home_Page.login_btn().click();
    Login_Page.email_field().sendKeys(configFileReader.getUserEmail());
    Login_Page.password_field().sendKeys(configFileReader.getUserPassword());
    Login_Page.login_btn().click();
}

    @And("User opens programs page")
    public void userOpensProgramsPage() {
        Header.programs_btn().click();
    }

    @And("User clicks more details")
    public void userClicksMoreDetails() {
        ProgramsPage.moreDetails_btn().get(configFileReader.getfoundProgramsIndex()).click();
    }

    @When("User clicks on favorite icon")
    public void userClicksOnFavoriteIcon() {
         progDetailsPage.favorite_icon().click();
         System.out.println("Found Program Name:  " +progDetailsPage.programName_txt());
         getprogramName_txt = progDetailsPage.programName_txt();
    }
    @And("User opens Dashboard")
    public void userOpensDashboard() {
    Header.dashboard_btn().click();
    }
    @And("User opens favorites section")
    public void userOpensFavoritesSection() {
        DashboardPage.cookies_btn().click();
        DashboardPage.favorite_btn().click();
    }

    @Then("The selected programs appear on favorites")
    public void theSelectedProgramsAppearOnFavorites() {
        System.out.println(" Favorite Program Name " + DashboardPage.favorites_titles_txt());
        Assert.assertEquals(DashboardPage.favorites_titles_txt(),getprogramName_txt);
    }
}
