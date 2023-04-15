Feature: Search

  Scenario Outline: Searching for various products
    Given User Launch a Chrome Browser
    When User opens an URL "https://www.amazon.com/"
    And User enters Product as "<pname>" 
    And Click on the Search button
    Then the Page Title should be "<ptitle>"
    When user closes browser
    Then the Browser is closed

Examples:
| pname |                    |ptitle|
| iphone14 |                 |Amazon.com : iphone14|
| bosch microwave|          |Amazon.com : bosch microwave|