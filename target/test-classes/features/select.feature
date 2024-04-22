Feature: Select Flights
  As a user
  I want to select the flights for my trip
  So that I can make my flight bookings

  Scenario: Select round trip flights
    Given I have searched for round trip flights
    When I click on the departing flight
    And click on the returning flight
    And select a booking option
    Then I should see a new tab open with the airline website where I can book the flight

  Scenario: Select round trip flights
    Given I have searched for one way flights
    When I click on the departing flight
    And select a booking option
    Then I should see a new tab open with the airline website where I can book the flight

  Scenario: Select round trip flights
    Given I have searched for multi city flights
    When I click on the first flight
    And click on the second flight
    And select a booking option
    Then I should see a new tab open with the airline website where I can book the flight

