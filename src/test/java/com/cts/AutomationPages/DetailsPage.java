package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {
	private By SignInLoc=By.linkText("Sign in");
	private WebDriver driver;
	public DetailsPage(WebDriver driver) {
		this.driver=driver;
	}
public  void clickSignIn() {
	driver.findElement(SignInLoc).click();
}

}
