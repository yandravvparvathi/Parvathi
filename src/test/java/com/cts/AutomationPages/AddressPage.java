package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
	private  By deliveryLoc=By.xpath("(//span[text()='Update'])[1]");
	private  By billingLoc=By.xpath("(//span[text()='Update'])[2]");
	private  By proceedLoc=By.name("processAddress");
	private WebDriver driver;
	public AddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  void deliveryUpdate() {
		driver.findElement(deliveryLoc).click();
		
	}
	public  void billingUpdate() {
		driver.findElement(billingLoc).click();
		
	}
	public  void  clickOnProceed() {
		driver.findElement(proceedLoc).click();
	}


}
