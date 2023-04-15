#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Login

  Scenario Outline: Successful Login with Valid Credentials
    Given User Launch Chrome Browser
    When User opens URL "https://mail.rediff.com/cgi-bin/login.cgi"
    And User enters Username as "<Username>" and Password as "<Password>"
    And Click on Signin
    Then Page Title should be "Rediffmail"
    When User click on Logout link
    Then Logout Page Title should be "Welcome to Rediffmail"
    When close browser
    Then Browser is closed

Examples:
| Username | Password |
| demoxoxo | Selenium1! |
| demox | Seleniumsss1! |

