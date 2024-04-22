package com.superchoice.stepdefinitions;

import com.superchoice.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class SearchSteps {

    private WebDriver driver;
    private HomePage homePage;

    @Given("I am on the Google Flights homepage")
    public void iAmOnTheGoogleFlightsHomepage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luisc\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.openHomePage();
    }

    @When("I search for round trip flights from {string} to {string} on {string} returning on {string}")
    public void searchForRoundTripFlight(String origin, String destination, String departureDate, String returnDate) {
        homePage.searchForRoundTripFlight(origin, destination, departureDate, returnDate);
    }

    @When("I search for one way flights from {string} to {string} on {string}")
    public void searchForOneWayFlight(String origin, String destination, String departureDate) {
        homePage.searchForOneWayFlight(origin, destination, departureDate);
    }

    @When("I search for multi city flights from {string} to {string} on {string}")
    public void searchForMultiCityFlight(String origin, String destination, String departureDate) {
        homePage.searchForMultiCityFlight(origin, destination, departureDate);
    } 
    
    @And("I add a flight from {string} to {string} on {string}")
    public void addMultiCityFlight(String origin, String destination, String departureDate) {
        homePage.addMultiCityFlight(origin, destination, departureDate);
    } 

    @Then("I should see a list of available flight options")
    public void iShouldSeeAListOfAvailableFlightOptions() {
        assertTrue(homePage.isFlightOptionsDisplayed());
        driver.quit();
    }
}