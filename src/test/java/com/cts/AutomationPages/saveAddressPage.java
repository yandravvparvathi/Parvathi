package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saveAddressPage {
	private  By saveDevLoc = By.name("submitAddress");
	private WebDriver driver;

	public saveAddressPage(WebDriver driver) {
		this.driver = driver;
	}

	public  void saveDelivery() {
		driver.findElement(saveDevLoc).click();
	}
}
