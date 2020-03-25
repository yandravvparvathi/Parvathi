package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingCheckoutPage {
	private By checkoutLoc=By.name("processCarrier");
	private By withCheckLoc=By.name("cgv");
	 private WebDriver driver;
	 public ShippingCheckoutPage(WebDriver driver) {
		 this.driver=driver;
	 }
	 public  void clickOnproceed(){
		 driver.findElement(checkoutLoc).click();
	 }
	 public void clickOncheckbox() {
		 driver.findElement(withCheckLoc).click();
	 }
}
