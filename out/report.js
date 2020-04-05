$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myhotel.create-account.feature");
formatter.feature({
  "line": 1,
  "name": "my hotel create account",
  "description": "",
  "id": "my-hotel-create-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User creates an account",
  "description": "",
  "id": "my-hotel-create-account;user-creates-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "an open browser with https://qloapps.coderslab.pl/",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enters emailAddress and clicks Create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user fills firstName, lastName and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user chooses Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Your account has been created message appears",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close google",
  "keyword": "And "
});
formatter.match({
  "location": "myHotelregistration.anOpenBrowserWithHttpsQloappsCoderslabPl()"
});
formatter.result({
  "duration": 5067578300,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.userClicksSignInButton()"
});
formatter.result({
  "duration": 475581400,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.entersEmailAddressAndClicksCreateAnAccountButton()"
});
formatter.result({
  "duration": 336601800,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.userFillsFirstNameLastNameAndPassword()"
});
formatter.result({
  "duration": 2347330900,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.userChoosesDateOfBirth()"
});
formatter.result({
  "duration": 377201300,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.userClicksRegisterButton()"
});
formatter.result({
  "duration": 487518900,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.yourAccountHasBeenCreatedMessageAppears()"
});
formatter.result({
  "duration": 70356400,
  "status": "passed"
});
formatter.match({
  "location": "myHotelregistration.closeGoogle()"
});
formatter.result({
  "duration": 45700,
  "status": "passed"
});
});