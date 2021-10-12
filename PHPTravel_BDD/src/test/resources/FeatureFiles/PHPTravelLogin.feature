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
    