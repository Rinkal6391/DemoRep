$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is present in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.user_is_present_in_login_page()"
});
formatter.result({
  "duration": 8205075620,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 1121625427,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 290995924,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 169226568,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_on_home_page()"
});
formatter.result({
  "duration": 450117334,
  "status": "passed"
});
});