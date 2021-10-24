Feature: Login to PHP Travel portal 

  @sanity @sameer @PHPTravel @negetive
  Scenario: PHP Travel logon with invalid creds
    Given User is on PHPTravel home page
    And Clicking login button to navigate Login page
    When enter username and password in login screen
    |username                      |password      |
    |XXXXXXXX@phptravel.com        |xxxxxxxxx     | 
    And click on signin button
    Then check error message

  @sanity @sameer @PHPTravel @positive
  Scenario Outline: PHP Travel logon with valid creds
    Given User is on PHPTravel home page
    Given Clicking login button to navigate Login page
    When enter username as "<username>" and password as "<password>" in login screen
    And click on signin button
    Then I verify the "<success>" message in user homepage

    Examples: 
      | username            | password | success      |
      | user@phptravels.com | demouser | Welcome Back |
     
  @sanity @sameer @PHPTravel @positive @Flights
  Scenario Outline: PHP Travel logon with valid creds
    Given User is on PHPTravel home page
    And Clicking login button to navigate Login page
    When enter username as "<username>" and password as "<password>" in login screen 
    And click on signin button
    When user click on "<navigation>" tab in dashboard should navigate to tours page
    When enter "<FromCity>" and "<ToCity>" then click on search to get flights list
    Then verify the flight list and update to data sheet
    Examples: 
      | username            | password | navigation      |FromCity|ToCity|
      | user@phptravels.com | demouser | flights         |MAA     |GOI   |