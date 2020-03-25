package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class updatePage {
	private WebDriver driver;
	private By BillLoc = By.name("submitAddress");

	public updatePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void billingSave() {
		driver.findElement(BillLoc).click();
	}

}
