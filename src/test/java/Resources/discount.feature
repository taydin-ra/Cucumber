Feature: Create a discount

  Scenario Outline: Discount Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameter
    And Click on Discount
    And Click on plus icon
    And Type in the Description "<Description1>"
    And Type in the Integration Code "<IntegrationCode1>"
    And Type in the Priority "<Priority1>"
    Then "<Description1>" should be displayed
    And Remove the data "<Description1>"
    Then Verify data is removed "<Description1>"

    When Click on save button

    Examples:
    |Description1|IntegrationCode1|Priority1|
    |MyDescription2|MyIntegrationCode2|Priority2|
    |MyDescription3|MyIntegrationCode3|Priority3|
    |MyDescription4|MyIntegrationCode4|Priority4|

