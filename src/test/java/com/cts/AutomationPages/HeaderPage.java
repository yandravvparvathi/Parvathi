package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
	private WebDriver driver;
	private By accountLoc=By.xpath("//h1[@class='page-heading']");
	public HeaderPage(WebDriver driver) {
		this.driver=driver;
	}
public void AccountClick() {
	WebElement ele=driver.findElement(accountLoc);
	ele.getText();
}
}
