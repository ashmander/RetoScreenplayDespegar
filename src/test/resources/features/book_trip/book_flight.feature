Feature: Book flight
  As a traveller
  I want to book a flight
  To be ready to travel

  Scenario: Book a flight in Despegar from Medellin to Santa Marta
    Given Andres wants book a flight to Santa Marta
    When Andres book the flight from Medellin to Santa Marta
    Then Andres should see the button to buy the flight