Feature: Login to application

In order perform successful login
As a user
I want to enter valid credentials.

Scenario: In order to verify the successful login
Given user opens the login page
When user enters username and password
And click on sign in button
Then validate the home screen launch after login