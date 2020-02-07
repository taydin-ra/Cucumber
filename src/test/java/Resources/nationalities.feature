Feature: Create a Nationality
  @SmokeTest
  Scenario:  Nationality Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameter
    And Click on Nationality
    And Click on plus icon
    And Type in the Name "CucumberNationality1"
    When Click on save button
    Then "CucumberNationality1" should be displayed
    And Remove the data "CucumberNationality1"
    Then Verify data is removed "CucumberNationality1"