Feature: verify Swag Labs

Scenario: Successful login with valid credentials 
Given user is at login page 
When user enter user name "<username>" and password "<password>"
Then user should see the product page 

 