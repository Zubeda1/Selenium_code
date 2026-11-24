package com.react.steps;

import com.react.driver.DriverManager;
import com.react.pages.HeaderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {

    private DriverManager driverManager = new DriverManager();
    private HeaderPage headerPage = new HeaderPage();

    @Given("^I launch a  Chrome Browser$")
    public void i_launch_a_chrome_browser() {
        driverManager.runOnChrome();
    }

    @And("^I open the URL on the browser$")
    public void i_open_the_URL_on_the_browser() {
        driverManager.navigateTo();
    }

    @When("^I search for item$")
    public void i_search_for_item() {
        headerPage.searchSomething();
    }

    @Then("^I should  view the item$")
    public void i_should_view_the_item() {
        headerPage.searchItem();
    }
}
