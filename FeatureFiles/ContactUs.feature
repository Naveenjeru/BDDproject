Feature: Verifying the contact us Page

Scenario: Successfully fill and submit the contact form
Given user navigates to the contact us page
When user enters their name "naveen"
And user enters their email address "shivalaptop1@gmail.com"
And user fills the enquiry message with "abcdefghijklmnopqrst"
Then user clicks the submit button


Scenario: Submitting the contact form with missing name
Given user navigates to the contact us page
When user leaves the name field empty
And user enters their email address "shivalaptop1@gmail.com"
And user fills the enquiry message with "abcdefghijklmnopqrst"
Then user clicks the submit button

Scenario: Submitting the contact form with an invalid email address
Given user navigates to the contact us page
When user enters their name "naveen"
And user enter an invalid email address "shivalaptop1gmail.com"
And user fills the enquiry message with "abcdefghijklmnopqrst"
Then user clicks the submit button
