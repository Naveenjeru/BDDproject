Feature: verify the registration account page

 @sanity @regression 
Scenario: User successfully creates an account with valid credentials
Given  user navigates to the register page
When  user enters their first name "John"
And  user enters their last name "Doe"
And  user enters their valid email address "john.doe@example.com"
And  user enters their telephone number "1234567890"
And  user enters their password "SecurePass123"
And  user enters their confirm password "SecurePass123"
And  user clicks the privacy policy
And  user clicks the continue button
Then  user successfully opens their account


@smoke  @regression 
Scenario: User cannot create an account with mismatched passwords
Given user navigates to the register page
When user enters their first name "Alice"
And user enters their last name "Smith"
And user enters their valid email address "alice.smith@example.com"
And user enters their telephone number "9876543210"
And user enters their password "Password123"
And user enters their confirm password "DifferentPassword123"
And user clicks the privacy policy
And user clicks the continue button
Then user is shown an error message indicating that the passwords do not match

@smoke @sanity 
Scenario: User cannot create an account with an invalid email address
Given user navigates to the register page
When user enters their first name "Bob"
And user enters their last name "Johnson"
And user enters an invalid email address "bob.johnsonexample.com"
And user enters their telephone number "5551234567"
And user enters their password "BobSecure123"
And user enters their confirm password "BobSecure123"
And user clicks the privacy policy
And user clicks the continue button
Then user is shown an error message indicating that the email address is invalid

 @regression 
Scenario: User cannot create an account without accepting the privacy policy
Given user navigates to the register page
When user enters their first name "Charlie"
And user enters their last name "Brown"
And user enters their valid email address "charlie.brown@example.com"
And user enters their telephone number "6543219870"
And user enters their password "Charlie123"
And user enters their confirm password "Charlie123"
But user does not click on the privacy policy checkbox
And user clicks the continue button
Then user is shown an error message indicating that the privacy policy must be accepted

