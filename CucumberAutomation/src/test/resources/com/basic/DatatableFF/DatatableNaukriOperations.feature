Feature: Naukri portal operations
As a user I want to login Naukri and check latest job postings


Background: Naukri Login page validation
Given user need to be navigate to naukri login page
When click on Naukri login button
#And user enters naukri username as "sameer.cse58@gmail.com" and password as "ramu2127@"
And user login with given credentials
     |username                |password |
     |sameer.cse58@gmail.com  |ramu2127@|

@regression @Sameer @loginscenario
Scenario: Validate user navigated to naukri login page.
Then Naukri Signin button should be clickable
Then close the Nbrowser

@sanity @Sameer @loginscenario
Scenario: Validate user Logged in to Naukri and confirm username.
And click on Naukri 2nd login button
Then check the "Sameer Yalla" on home page
Then close the Nbrowser