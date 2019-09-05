Feature: Aplication login 

Background:
Given Select Browser "Chrome" to open 
When Maximise the Browser
Then Delete the Cookies 

@SmokeTest
Scenario: Login to Home page with regular expression 
Given User is on Net Banking Landing page
When User login with Username "Ajay" and Password "1234" 
Then Home page is displayed
And Cards are displayed "True"

@RegTest
Scenario: Login to Home page with regular expression
Given User is on Net Banking Landing page
When User login with Username "Bimal" and Password "4321" 
Then Home page is displayed
And Cards are displayed "False"