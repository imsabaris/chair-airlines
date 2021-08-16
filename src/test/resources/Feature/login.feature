Feature: Check the Login Functionality of chair Airlines

  Background: 
    Given user clicks customer login from Homepage

  Scenario: check the login with valid credentials
    When user enters the valid username
    When user enters the valid password
    And user clicks login button

  Scenario Outline: : check the login with invalid credentials
    When user enters invalid "<username>" 
    When user enters invalid_pass"<password>"
    And user clicks the login

    Examples: 
      | username          | password   |
      | willsmith         | will12345  |
      |                   | scary12345 |
      | scaryy            |            |
      | Avenger@gmail.com | avengers   |
