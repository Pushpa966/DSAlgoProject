@Get1
Feature: Test ds algo portal link

 @Page
 Scenario: Launch url and navigate to home page
    Given User launch chrome browser
    And User opens dsalgo portal app url
    When User click on Get Started button
    Then User is navigated to Home page
    
    