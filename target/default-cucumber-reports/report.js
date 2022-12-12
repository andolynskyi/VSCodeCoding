$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google.feature");
formatter.feature({
  "name": "Related to test google website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test google search field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "user should be able go to the website",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchField_stepDefs.user_should_be_able_go_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type in the search field the item what them need",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchField_stepDefs.user_type_in_the_search_field_the_item_what_them_need()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able see search result",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchField_stepDefs.user_should_be_able_see_search_result()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat step_definitions.google_stepDefs.GoogleSearchField_stepDefs.user_should_be_able_see_search_result(GoogleSearchField_stepDefs.java:37)\n\tat ✽.user should be able see search result(src/test/resources/features/google.feature:7)\n",
  "status": "pending"
});
});