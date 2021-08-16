Feature: To check the sign-up functionality of the chair Airlines

  Scenario: Check the sign up functionality with different types of datas
    Given User need to be in home_page
    Given user clicks the customer login
    Given user clicks signup from customer login
    When user enters the first name
    When user enters the last name
    When user enters the company name
    When user enters the street name
    When user enters the city name
    When user selects the country
    When user enters the zip code
    When user enters the phone number
    When user enters the email
    When user enters the password
    When user re_enters the password
    And user clicks the signup button
    
    

