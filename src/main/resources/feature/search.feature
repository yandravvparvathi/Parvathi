Feature: Search Action 

Background: 
	Given User have a browser with logaAutomationpage  
	
Scenario: LogoAutomation validSearch Action 


	When User enter "Shirts" in search box 
	Then Assert for the presence of Faded Short Sleeve T-shirts and close browser 
	
	
	
Scenario: LogoAutomation invalidSearch Action 

	When User enter "Tables" in search box 
	Then Assert for the presence of No results were found for your search Tables element and close the browser 
	
	
Scenario: LogoAutomation click women Icon 
	When User click on women Icon 
	And move to tops and select for medium size and short sleeve button 
	Then check both the medium size and short sleeve is checked 
	
Scenario: LogoAutomation click on quantity icon 
	When User enter "Dresses" in search box 
	And move to image icon 
	Then User click on quantity icon 
	

	
	
	
