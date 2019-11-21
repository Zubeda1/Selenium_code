package stepdefination;

import driver.DriverManager;
import pages.HeaderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep {
     private DriverManager driverManager = new DriverManager();
    private HeaderPage headerpage = new HeaderPage();
    @Given("^I open the URL on the browser$")
    public void i_open_the_URL_on_the_browser() {
     driverManager.navigateTo();

    }

    @When("^I search for item$")
    public void i_search_for_item(){
        headerpage.searchSomething();
    }

    @Then("^I should  view the item$")
    public void i_should_view_the_item(){
    }

}
