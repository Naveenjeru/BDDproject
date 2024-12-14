Feature: verifying the scenario Outline for login page
@smoke
Scenario Outline: login with multiple sets of data
  Given user navigates to the login home page
  When user enters his email address in address field "<email>"
  And user enters his password in password field "<password>"
  And user clicks on the login button
  Then user navigates to the inside page

Examples:
  | email                     | password |
  | shivalaptop1@gmail.com     | 12345    |
  | naveenlaptop1@gmail.com    | 12345  |
 | shivalaptop1@gmail.com     | 12345    |
  | naveenlaptop1@gmail.com     | 12345   |
   | shivalaptop1@gmail.com     | 12345    |
  |  naveenlaptop1@gmail.com      | 12345    |
   | shivalaptop1@gmail.com     | 12345    |
  | naveenlaptop1@gmail.com   | 12345   |