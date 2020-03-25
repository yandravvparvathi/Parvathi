package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {

	private static By clickOnSignOutLoc=By.partialLinkText("Sign out");

	public static void clickOnSignOut(WebDriver driver) {
		driver.findElement(clickOnSignOutLoc).click();
	}
}
