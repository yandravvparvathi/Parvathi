Feature: Scenarios 
	In order to check if the application is wirking as required

Background: 
	Given User have a browser with logaAutomationpage  
Scenario: SignInCredential 
	When The user click on signIn 
	When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and click on SignIn 
	Then The user should access to nextPage 
	

Scenario: SelectionCredential
When the user move to women and select required items
Then the user should navigate to the next page


Scenario: AddToCart
When The user move to image and click on AddToCart and next click on checkout button
And When The user click on proceed to checkout
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
Then The user should access  to next portal

Scenario: delivery Address
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  delivery update and  click on save and proceed to checkout
Then The user should access to Address Portal


Scenario: Billing Address
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  billing update and  click on save and proceed to checkout
Then The user should access to Address Portal1


Scenario: delete from cart
When The user move to image and click on AddToCart1 and next click on checkout button
When click on delete icon
Then item is deleted from the cart


Scenario: Shipping without agreeing terms
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  billing update and  click on save and proceed to checkout
When the user click on proceed to checkout
Then the application popsup error message.


Scenario: Shipping  agreeing terms
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  billing update and  click on save and proceed to checkout
When the user click on checkbox and proceed to checkout
Then the application naviagates to nextpage


Scenario: Shipping  agreeing terms
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  billing update and  click on save and proceed to checkout
When the user click on checkbox and proceed to checkout  
When the user click on paybycheck and click confirm order
Then the order is confirmed


Scenario: Shipping  agreeing terms
When The user move to image and click on AddToCart1 and next click on checkout button
And When The user click on proceed to checkout1
When The user enter emailId 'sindhujuttiga@gmail.com' and Password 'sindhuja' and  on click on SignIn 
When The user click on  billing update and  click on save and proceed to checkout
When the user click on checkbox and proceed to checkout
When the user click on paybybankwire and click confirm order
Then the order is confirmed


Scenario: contactus
When the user clicks on contactus
When the user choose heading
And the user enters email address as 'yandravvparvathi@gmail.com' and orderReference as '123456'
And upload 'src/test/resources/resource/paper presentation.docx' 
And send message as 'please respond'
When click on send
Then user will get meassage
