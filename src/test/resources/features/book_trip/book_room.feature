Feature: Book room
  As a traveller
  I want to book a room
  To have a room when I get to my destination

  Scenario: Book a room in Despegar in Santa Marta
    Given Andres wants book a room in Santa Marta
    When Andres book the room in Santa Marta
    Then Andres should see the button to buy the reserve