package com.superchoice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;

    // Constructor
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interacting with elements on the search results page
    // Example:
    public boolean areSearchResultsDisplayed() {
        return driver.findElement(By.cssSelector(".search-results")).isDisplayed();
    }
}