$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calculator.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: mnolas60@asu.edu"
    }
  ],
  "line": 3,
  "name": "Calculator Testing",
  "description": "",
  "id": "calculator-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "calculator-testing;title-of-your-scenario-outline",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I want to open application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenApplication.i_want_to_open_application()"
});
formatter.result({
  "duration": 1818459700,
  "status": "passed"
});
formatter.match({
  "location": "Calculator.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 1596373500,
  "status": "passed"
});
});