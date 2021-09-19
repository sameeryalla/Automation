Feature: FB Login functionality
As a user I want to login Facebook and check username at home page


Scenario: Validate user navigated to login page.
Given user need to be navigate to FB logoin page
When user enters username as "username"
And user enters password as "password"
Then Signin button should be clickable

Scenario: Facebook login with valid credentials.
Given user need to be navigate to FB login page
When user enters username as "username"
And user enters password as "password"
And click on Login button
Then user need to check username in homepage 