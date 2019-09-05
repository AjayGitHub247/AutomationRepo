Feature: Aplication login 

@SmokeTest
Scenario: Home page default login
Given User is on Net Banking Landing page
When User login with Username and Password
Then Home page is displayed
And All Cards are displayed