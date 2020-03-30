$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/loga.feature");
formatter.feature({
  "name": "LogaAutomation",
  "description": "\tI have to order in logaAutomation\nAs a customer",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create an Account  with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on signin button and User have to get the account details from ExcelSheet \"src/test/resources/resource/accountdetails.xlsx\" and sheetname \"CreateAccount\" and User should click on Register Button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_User_have_to_get_the_account_details_from_ExcelSheet_and_sheetname_and_User_should_click_on_Register_Button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the application navigate to next page contains page header as \u0027My Account\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_application_navigate_to_next_page_contains_page_header_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create an Account  with Invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on signin button and User have to get the account details from ExcelSheet \"src/test/resources/resource/accountdetails.xlsx\" and sheetname \"CreateAccount\" and click on Register Button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_User_have_to_get_the_account_details_from_ExcelSheet_and_sheetname_and_click_on_Register_Button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message should print in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_error_message_should_print_in_the_console()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin button and user should click on login button and enter username as \u0027\u003cemailAddress\u003e\u0027 and enter password as \u0027\u003cpassword\u003e\u0027 and click on signin button",
  "keyword": "When "
});
formatter.step({
  "name": "i should access to the portal with title as My account and click on SignOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ]
    },
    {
      "cells": [
        "yandravvparvathi@gmail.com",
        "Parvathi@1"
      ]
    },
    {
      "cells": [
        "sindhujuttiga@gmail.com",
        "sindhuja"
      ]
    },
    {
      "cells": [
        "vadlamani@gmail.com",
        "vrppvr"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin button and user should click on login button and enter username as \u0027yandravvparvathi@gmail.com\u0027 and enter password as \u0027Parvathi@1\u0027 and click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_user_should_click_on_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should access to the portal with title as My account and click on SignOut",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.i_should_access_to_the_portal_with_title_as_My_account_and_click_on_SignOut()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin button and user should click on login button and enter username as \u0027sindhujuttiga@gmail.com\u0027 and enter password as \u0027sindhuja\u0027 and click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_user_should_click_on_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should access to the portal with title as My account and click on SignOut",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.i_should_access_to_the_portal_with_title_as_My_account_and_click_on_SignOut()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin button and user should click on login button and enter username as \u0027vadlamani@gmail.com\u0027 and enter password as \u0027vrppvr\u0027 and click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_user_should_click_on_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should access to the portal with title as My account and click on SignOut",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.i_should_access_to_the_portal_with_title_as_My_account_and_click_on_SignOut()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Invalid Username and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on signin button and user should click login button and enter username as \u0027v@gmail.com\u0027 and enter password as \u0027shu123\u0027 and click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_signin_button_and_user_should_click_login_button_and_enter_username_as_and_enter_password_as_and_click_on_signin_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should print in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.error_message_should_print_in_the_console()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/feature/logaa.feature");
formatter.feature({
  "name": "Scenarios",
  "description": "\tIn order to check if the application is wirking as required",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SignInCredential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user click on signIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_signIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should access to nextPage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_should_access_to_nextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "SelectionCredential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user move to women and select required items",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_women_and_select_required_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should navigate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_should_navigate_to_the_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "AddToCart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should access  to next portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_should_access_to_next_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "delivery Address",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  delivery update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_delivery_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should access to Address Portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_should_access_to_Address_Portal()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Billing Address",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  billing update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should access to Address Portal1",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_should_access_to_Address_Portal1()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "delete from cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on delete icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_delete_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "item is deleted from the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.item_is_deleted_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Shipping without agreeing terms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  billing update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the application popsup error message.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_application_popsup_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Shipping  agreeing terms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  billing update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on checkbox and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_checkbox_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the application naviagates to nextpage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_application_naviagates_to_nextpage()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Shipping  agreeing terms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  billing update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on checkbox and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_checkbox_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on paybycheck and click confirm order",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_paybycheck_and_click_confirm_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the order is confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_order_is_confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Shipping  agreeing terms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user move to image and click on AddToCart1 and next click on checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_move_to_image_and_click_on_AddToCart1_and_next_click_on_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When The user click on proceed to checkout1",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.when_The_user_click_on_proceed_to_checkout1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter emailId \u0027sindhujuttiga@gmail.com\u0027 and Password \u0027sindhuja\u0027 and  on click on SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enter_emailId_and_Password_and_on_click_on_SignIn(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on  billing update and  click on save and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_billing_update_and_click_on_save_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on checkbox and proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_checkbox_and_proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on paybybankwire and click confirm order",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_click_on_paybybankwire_and_click_confirm_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the order is confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_order_is_confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "contactus",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user clicks on contactus",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_clicks_on_contactus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user choose heading",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_choose_heading()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters email address as \u0027yandravvparvathi@gmail.com\u0027 and orderReference as \u0027123456\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.the_user_enters_email_address_as_and_orderReference_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "upload \u0027src/test/resources/resource/paper presentation.docx\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.upload(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send message as \u0027please respond\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.send_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on send",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.click_on_send()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get meassage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_will_get_meassage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/feature/search.feature");
formatter.feature({
  "name": "Search Action",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LogoAutomation validSearch Action",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter \"Shirts\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_enter_in_search_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert for the presence of Faded Short Sleeve T-shirts and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.assert_for_the_presence_of_Faded_Short_Sleeve_T_shirts_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LogoAutomation invalidSearch Action",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter \"Tables\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_enter_in_search_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert for the presence of No results were found for your search Tables element and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.assert_for_the_presence_of_No_results_were_found_for_your_search_Tables_element_and_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LogoAutomation click women Icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on women Icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_click_on_women_Icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move to tops and select for medium size and short sleeve button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.move_to_tops_and_select_for_medium_size_and_short_sleeve_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check both the medium size and short sleeve is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.check_both_the_medium_size_and_short_sleeve_is_checked()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have a browser with logaAutomationpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_have_a_browser_with_logaAutomationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LogoAutomation click on quantity icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter \"Dresses\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_enter_in_search_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "move to image icon",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.move_to_image_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on quantity icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.Stepdefinition.logaStepDefinition.user_check_on_quantity_icon()"
});
formatter.result({
  "status": "passed"
});
});