
@tag
Feature: Free CRM create a contact
  @tag1
  Scenario Outline: Free CRM create a contact Scenario
    Given user is present in login page 
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user move to new contact page
    Then user enter contact "<firstname>" and "<lastname>" and "<position>"
    Then close the browser


    Examples: 
     |username|password|firstname|lastname|position|
     |naveenk	|test@123|Tom   	 |peter   |manager |
     |naveenk |test@123|geourge  |saini   |Director|