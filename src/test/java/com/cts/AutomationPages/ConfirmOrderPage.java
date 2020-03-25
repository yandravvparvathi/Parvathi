package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage {
	private By confirmLoc=By.xpath("//a[@title='Pay by bank wire']");
	private WebDriver driver;
	public ConfirmOrderPage(WebDriver driver) {
		 this.driver=driver;
	 }
public  void clickOnConfirm() {
	driver.findElement(confirmLoc).click();
}
}
