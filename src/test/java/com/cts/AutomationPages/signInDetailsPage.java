package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInDetailsPage {
	private  By EmailLoc=By.id("email");
	private  By passwordLoc=By.id("passwd");
	private  By signLoc=By.id("SubmitLogin");
	private WebDriver driver;
	public signInDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	public  void enterEmail(String email) {
		driver.findElement(EmailLoc).sendKeys(email);
	}
	public  void enterPassword(String Password) {
		driver.findElement(passwordLoc).sendKeys(Password);
	}
	public  void clickSignIn(){
		driver.findElement(signLoc).click();
	}
}
