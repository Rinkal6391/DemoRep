#Feature: Free CRM login feature
#data drien testing without using example keyword.
#Scenario: Free CRM login Test Scenario
#Given user is present in login page
#When title of login page is Free CRM
# Then user enters "naveenk" and "test@123"  --1. data driven testing without using example keyword
#Then user clicks on login button
#Then user is on home page
#data driven testing using examples keyword and scenario outline.
Feature: Free CRM login feature

  Scenario Outline: Free CRM login Test Scenario
    Given user is present in login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page

    Examples: 
      | username | password |
      | naveenk  | test@123 |
      | tom      | test@234 |
      | jammy    | test@345 |
