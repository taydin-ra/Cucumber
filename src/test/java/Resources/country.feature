Feature: Create Citizenship

  Scenario: Citizenship creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameter
    And Click on countries
    And Click on plus icon
    And Type in the Name "SillyCountry"
    And Type in the code "Countryvella"
    When Click on save button
    Then "SillyCountry" should be displayed




    # Advantage of cucumber
  # Understandable for everyone in the team
  # Report will be understandable for everone as well
  #