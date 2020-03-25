package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
private  By checkout=By.xpath("(//a[@title='Proceed to checkout'])[2]");
private WebDriver driver;
public  CheckOutPage(WebDriver driver) {
	this.driver=driver;
}

	public  void checkoutPage() {
		driver.findElement(checkout).click();
	}
}
