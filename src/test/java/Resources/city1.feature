Feature: Create a city

    Scenario Outline: City Creating

      Given Go to mersys website
      And Type the username and password and click on login button
      And Click on setup on top
      And Click on parameter
      And Click on City
      And Click on plus icon
      And Type in the Name "<CityName>"
      And Choose any value from the dropdown
      When Click on save button
      Then "<CityName>" should be displayed
      Then Remove the data "<CityName>"
      Then Verify data is removed "<CityName>"

      Examples:
      |CityName|
      |Alpharetta|
      |Roswell|
      |Cumming|




