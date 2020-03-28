package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {

	private  By clickOnSignOutLoc=By.partialLinkText("Sign out");
    private WebDriver driver;
	
	public SignOutPage(WebDriver driver) {
		this.driver=driver;
	}
	public  void clickOnSignOut(WebDriver driver) {
		driver.findElement(clickOnSignOutLoc).click();
	}
}
