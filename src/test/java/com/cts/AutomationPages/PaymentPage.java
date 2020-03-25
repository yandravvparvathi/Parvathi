package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
	private  By checkLoc=By.xpath("//a[@title='Pay by check.']");
	private By bankLoc=By.xpath("//a[@title='Pay by bank wire']");
	private WebDriver driver;
	public PaymentPage(WebDriver driver) {
		 this.driver=driver;
	 }
public  void payByCheck() {
	driver.findElement(checkLoc).click();
}
public  void paybybankwire() {
	driver.findElement(bankLoc).click();
	
}
}
