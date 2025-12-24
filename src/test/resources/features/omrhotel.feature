Feature: Verifying OmrHotel Login
Scenario: Verifying valid Credentials
Given User is on omrHotel page
When User enter username and password
And User click the login button
Then user should verify after login success message

