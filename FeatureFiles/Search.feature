Feature: verifying the search funtionality

@smoke @sanity @regression 
Scenario: Verify valid product search for "laptop"
Given user navigates to the home page
When user searches for the valid product "laptop"
And clicks the search button
Then laptop products are displayed in the search results

@smoke  @regression 
Scenario: Verify search returns no results for non-existent product
Given user navigates to the home page
When user searches for the non-existent product "xyz123phone"
And clicks the search button
Then no products are displayed

 @sanity @regression 
Scenario: Verify search handles special characters in query
Given user navigates to the home page
When user searches for the product "#$%^&*tablet"
And clicks the search button
Then no products are displayed







