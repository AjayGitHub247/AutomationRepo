Feature: Aplication login 

@WebTest
Scenario: Login to Home page with data table 
Given User is on Net Banking Landing page
When User login to application with following details
| Ajay | Kumar | ABCDabcd | ajay@gmail.com | 9663638568 | 1st Main | 560054 | Bangalore | Karnataka |
Then Home page is displayed
And Cards are displayed "True"