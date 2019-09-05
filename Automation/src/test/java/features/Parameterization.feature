Feature: Aplication login 

@MobileTest
Scenario Outline: Login to Home page with parameters
Given User is on Net Banking Landing page
When User login with Username <UserName> and Password <Password> Parameter
Then Home page is displayed
And Cards are displayed "True"

Examples: 
| UserName | Password |
| User1    | Pass1	  |
| User2    | Pass2    |
| User3    | Pass3	  |							
| User4    | Pass4	  |	