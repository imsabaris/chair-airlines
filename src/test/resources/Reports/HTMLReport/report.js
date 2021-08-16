$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Check the Login Functionality of chair Airlines",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks customer login from Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_customer_login_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check the login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters the valid username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_the_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_the_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": ": check the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters invalid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters invalid_pass\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks the login",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "willsmith",
        "will12345"
      ]
    },
    {
      "cells": [
        "",
        "scary12345"
      ]
    },
    {
      "cells": [
        "scaryy",
        ""
      ]
    },
    {
      "cells": [
        "Avenger@gmail.com",
        "avengers"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks customer login from Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_customer_login_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": check the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters invalid \"willsmith\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid_pass\"will12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks customer login from Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_customer_login_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": check the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters invalid \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid_pass\"scary12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks customer login from Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_customer_login_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": check the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters invalid \"scaryy\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid_pass\"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks customer login from Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_customer_login_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": check the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters invalid \"Avenger@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid_pass\"avengers\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_enters_invalid_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_clicks_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/signup.feature");
formatter.feature({
  "name": "To check the sign-up functionality of the chair Airlines",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the sign up functionality with different types of datas",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User need to be in home_page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDef.user_need_to_be_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the customer login",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDef.user_clicks_the_customer_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks signup from customer login",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDef.user_clicks_signup_from_customer_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the company name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_company_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the street name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_street_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the city name",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_city_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the country",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_selects_the_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the zip code",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_zip_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the phone number",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user re_enters the password",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDef.user_re_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the signup button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDef.user_clicks_the_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
});