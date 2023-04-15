$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Searching for various products",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch a Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens an URL \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Product as \"\u003cpname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the Search button",
  "keyword": "And "
});
formatter.step({
  "name": "the Page Title should be \"\u003cptitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user closes browser",
  "keyword": "When "
});
formatter.step({
  "name": "the Browser is closed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "pname",
        "",
        "ptitle"
      ]
    },
    {
      "cells": [
        "iphone14",
        "",
        "Amazon.com : iphone14"
      ]
    },
    {
      "cells": [
        "bosch microwave",
        "",
        "Amazon.com : bosch microwave"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Searching for various products",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch a Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Search.user_launch_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens an URL \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Search.user_opens_an_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Product as \"iphone14\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Search.user_enters_Product_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Search.click_on_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Page Title should be \"Amazon.com : iphone14\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Search.the_page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes browser",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Search.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Search.the_Browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching for various products",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch a Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Search.user_launch_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens an URL \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Search.user_opens_an_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Product as \"bosch microwave\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Search.user_enters_Product_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Search.click_on_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Page Title should be \"Amazon.com : bosch microwave\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Search.the_page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes browser",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Search.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Search.the_Browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
});