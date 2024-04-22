Feature: Search for Flights
  As a user
  I want to search for flights on Google Flights
  So that I can find suitable travel options

  Scenario: Search for round trip flights
    Given I am on the Google Flights homepage
    When I search for round trip flights from "Sydney" to "Los Angeles" on "2024-05-01" returning on "2024-06-01"
    Then I should see a list of available flight options

  Scenario: Search for one way flights
    Given I am on the Google Flights homepage
    When I search for one way flights from "Sydney" to "Los Angeles" on "2024-05-01"
    Then I should see a list of available flight options

  Scenario: Search for multi city flights
    Given I am on the Google Flights homepage
    When I search for multi city flights from "Sydney" to "Los Angeles" on "2024-05-01"
    And I add a flight from "Los Angeles" to "New York" on "2024-06-01"
    Then I should see a list of available flight options

