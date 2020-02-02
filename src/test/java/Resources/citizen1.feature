Feature: Create Citizenship

  Scenario: Citizenship creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameter
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name "Citizen"
    And Type the shortName "Ctzn"
    When Click on save button
    Then "Citizen" should be displayed
    Then Remove the data "Citizen"
    Then Verify data is removed "Citizen"



