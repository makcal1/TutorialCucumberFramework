package stepdefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import webPages.WeatherPage;

public class WeatherPageSD {
    private WeatherPage weatherPage = new WeatherPage();



    @Given("^I am on darsky page$")

public void HomePage(){
weatherPage.getURL();


    }

    @When("^I click on Today Section$")
    public void goToTodaySection(){
    weatherPage.scrollDownthePage();



    }
    @And("^I check the lowest and highest temp$")
    public void checkingTemprature(){


        weatherPage.clickTodayBtn();


    }

    @Then(("^Verify the lowest and highest temp is displayed correctly$"))
    public void verification(){
        weatherPage.verifylowestAndHighestTemp();


    }
}
