$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/cucumber/features/ChangeUserInformation/add-user-address.feature");
formatter.feature({
  "line": 1,
  "name": "User adds new address",
  "description": "",
  "id": "user-adds-new-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Create new address in user\u0027s account",
  "description": "",
  "id": "user-adds-new-address;create-new-address-in-user\u0027s-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to NewAddressPage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User fills the address form with \u003caddress\u003e, \u003ccity\u003e \u003cpostcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User saves changes",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User sees success message",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user confirms address data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User close chrome",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "user-adds-new-address;create-new-address-in-user\u0027s-account;",
  "rows": [
    {
      "cells": [
        "address",
        "city",
        "postcode"
      ],
      "line": 14,
      "id": "user-adds-new-address;create-new-address-in-user\u0027s-account;;1"
    },
    {
      "cells": [
        "Testowy 16",
        "Warsaw",
        "02703"
      ],
      "line": 15,
      "id": "user-adds-new-address;create-new-address-in-user\u0027s-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Create new address in user\u0027s account",
  "description": "",
  "id": "user-adds-new-address;create-new-address-in-user\u0027s-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to NewAddressPage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User fills the address form with Testowy 16, Warsaw 02703",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User saves changes",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User sees success message",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user confirms address data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User close chrome",
  "keyword": "And "
});
formatter.match({
  "location": "NewAddressTest.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 7701282800,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressTest.userGoesToNewAddressPage()"
});
formatter.result({
  "duration": 432741700,
  "status": "passed"
});
formatter.match({
  "location": "NewAddressTest.userClicksCreateNewAddress()"
});
formatter.result({
  "duration": 434492100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testowy 16",
      "offset": 33
    },
    {
      "val": "Warsaw",
      "offset": 45
    },
    {
      "val": "02703",
      "offset": 52
    }
  ],
  "location": "NewAddressTest.userFillsTheAddressFormWithAddressCityPostcode(String,String,String)"
});
formatter.result({
  "duration": 11355400,
  "error_message": "java.lang.NullPointerException\r\n\tat finalProject.task1.NewAddressTest.userFillsTheAddressFormWithAddressCityPostcode(NewAddressTest.java:54)\r\n\tat ✽.And User fills the address form with Testowy 16, Warsaw 02703(src/cucumber/features/ChangeUserInformation/add-user-address.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewAddressTest.userSavesChanges()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressTest.userSeesSuccessMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressTest.userConfirmsAddressData(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAddressTest.userCloseChrome()"
});
formatter.result({
  "status": "skipped"
});
});