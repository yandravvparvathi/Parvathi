package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage2 {
	private By clickLoc = By.name("processAddress");
	private By addressLoc = By.xpath("//h1[@class='page-heading']");
	private WebDriver driver;

	public CheckOutPage2(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPage(WebDriver driver) {
		driver.findElement(clickLoc).click();
	}

	public void clickadress() {
		WebElement ele1 = driver.findElement(addressLoc);
		ele1.getText();
	}
}
