$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Capstone1.feature");
formatter.feature({
  "line": 2,
  "name": "Items on the retail page test",
  "description": "",
  "id": "items-on-the-retail-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CapStoneTest"
    }
  ]
});
formatter.before({
  "duration": 2813655992,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on the desktop",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on all desktop",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2083034262,
  "status": "passed"
});
formatter.match({
  "location": "Capstone1StDef.user_click_on_the_desktop()"
});
formatter.result({
  "duration": 667300833,
  "status": "passed"
});
formatter.match({
  "location": "Capstone1StDef.user_click_on_all_desktop()"
});
formatter.result({
  "duration": 1139536891,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Retail page Items verifing",
  "description": "",
  "id": "items-on-the-retail-page-test;retail-page-items-verifing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Test44"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User should all items are present in Desktop page",
  "keyword": "Then "
});
formatter.match({
  "location": "Capstone1StDef.user_should_all_items_are_present_in_Desktop_page()"
});
formatter.result({
  "duration": 517764590,
  "status": "passed"
});
formatter.after({
  "duration": 229619621,
  "status": "passed"
});
});