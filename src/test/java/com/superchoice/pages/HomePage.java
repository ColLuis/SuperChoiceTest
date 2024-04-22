package com.superchoice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final String baseUrl = "https://www.google.com/travel/flights";
    private final WebElement flighTypeDropdown;
    private final WebElement oneWay;
    private final WebElement roundTrip;
    private final WebElement multiCity;
    private final WebElement originInput;
    private final WebElement destinationInput;
    private final WebElement departureInput;
    private final WebElement returnInput;
    private final WebElement searchButton;
    private final WebElement addFlightButton;
    

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.flighTypeDropdown = driver.findElement(By.xpath("//div[@jsname='oYxtQd']"));
        this.oneWay = driver.findElement(By.xpath("//li[@data-value='One way']"));
        this.roundTrip = driver.findElement(By.xpath("//li[@data-value='Round trip']"));
        this.multiCity = driver.findElement(By.xpath("//li[@data-value='Multi city']"));
        this.originInput = driver.findElement(By.cssSelector("input[aria-label='Where from?']"));
        this.destinationInput = driver.findElement(By.cssSelector("input[aria-label='Where to?']"));
        this.departureInput = driver.findElement(By.cssSelector("input[aria-label='Departure']"));
        this.returnInput = driver.findElement(By.cssSelector("input[aria-label='Return']"));
        this.searchButton = driver.findElement(By.cssSelector("input[aria-label='Search for flights']"));
        this.addFlightButton = driver.findElement(By.cssSelector("input[aria-label='Add flight']"));
    }

    public void openHomePage() {
        driver.get(baseUrl);
    }

    public void searchForRoundTripFlight(String origin, String destination, String departureDate, String returnDate) {
        flighTypeDropdown.click();
        roundTrip.click();
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureInput.sendKeys(departureDate);
        returnInput.sendKeys(returnDate);
        searchButton.click();
    }

    public void searchForOneWayFlight(String origin, String destination, String departureDate) {
        flighTypeDropdown.click();
        oneWay.click();
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureInput.sendKeys(departureDate);
        searchButton.click();
    }

    public void searchForMultiCityFlight(String origin, String destination, String departureDate) {
        flighTypeDropdown.click();
        multiCity.click();
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureInput.sendKeys(departureDate);
    }

    public void addMultiCityFlight(String origin, String destination, String departureDate) {
        addFlightButton.click();
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureInput.sendKeys(departureDate);
    }

    public boolean isFlightOptionsDisplayed() {
        return driver.findElement(By.cssSelector(":contains('Best departing flights')")).isDisplayed();
    }
}