Feature: Search a flight
  Scenario: Searching flight

    Given Go to the website
    And Type to "destination"
    And Type to "check-in" and "check-out" date
    And Close the date field
    Then Click on search button