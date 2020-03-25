Feature: LogaAutomation 
	I have to order in logaAutomation
As a customer
Background: 
	Given User have a browser with logaAutomationpage 
	
	
Scenario: Create an Account  with valid credentials 
	When click on signin button and User have to get the account details from ExcelSheet "src/test/resources/resource/accountdetails.xlsx" and sheetname "CreateAccount" and User should click on Register Button 
	Then the application navigate to next page contains page header as 'My Account'
	
	
	Scenario: Create an Account  with Invalid credentials 
	When click on signin button and User have to get the account details from ExcelSheet "src/test/resources/resource/accountdetails.xlsx" and sheetname "CreateAccount" and click on Register Button 
	Then the error message should print in the console
	
	
	Scenario Outline: Login with username and password
	When click on signin button and user should click on login button and enter username as '<emailAddress>' and enter password as '<password>' and click on signin button
	Then i should access to the portal with title as My account and click on SignOut
	Examples:
    |emailAddress|password|
    |yandravvparvathi@gmail.com|Parvathi@1|
    |sindhujuttiga@gmail.com|sindhuja|
    |vadlamani@gmail.com|vrppvr|
	
	Scenario: Login with Invalid Username and Password
	When click on signin button and user should click login button and enter username as 'v@gmail.com' and enter password as 'shu123' and click on signin button
	Then error message should print in the console