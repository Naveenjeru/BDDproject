Feature: Verify the login functionality

@smoke @sanity @regression 
Scenario: User logs in with valid credentials
Given the user navigates to the login page 
When the user enters valid username "shivalap1@gmail.com" 
And the user enters valid password "12345" 
And the user clicks the login button 
Then the user successfully navigates to the home page

@smoke  @regression 
Scenario: User logs in with invalid credentials
Given the user navigates to the login page 
When the user enters invalid username "invaliduser@gmail.com" 
And the user enters invalid password "wrongpassword" 
And the user clicks the login button 
Then user will see the error meassage

 @sanity @regression 
Scenario: User logs in with an empty username
Given the user navigates to the login page
When the user leaves the username field empty
And the user enters valid password "12345"
And the user clicks the login button
Then user will see the error meassage

@smoke @sanity
Scenario: User logs in with an empty password
Given the user navigates to the login page
When the user enters valid username "shivalap1@gmail.com"
And the user leaves the password field empty
And the user clicks the login button
Then user will see the error meassage