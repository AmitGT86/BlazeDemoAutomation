@tag
Feature: Feature to test getting Flight info

  @tag1
  Scenario: Getting Flight info
    Given browser is open
    Then User goes to Blaze Demo website
    And User waits 6 seconds
    And User chooses Departure city
    And User chooses Destination city
    And User clicks on Find Flights
    And User waits 6 seconds
    And User chooses flight
    And User waits 7 seconds again
    And User enter "Amit Barua" as the name
    And User enter "123 Main St" as the address
    And User enter "Long Beach" as the city
    And User enter "CA" as the state
    And User enter "90716" as the zip code
    And User select "Visa" as the card type
    And User enter "1234567890123456" as the credit card number
    And User select "06" as the card expiration month
    And User select "2025" as the card expiration year
    And User enter "Amit Barua" as the name on card
    And User waits 7 seconds to confirm
    And User click the "Purchase Flight" button
    And User waits 8 seconds to confirm
    Then Browser closes
