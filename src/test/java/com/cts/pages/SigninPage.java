package com.cts.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SigninPage {
	private static By enterEmailLoc = By.id("email_create");
	private static By createAccLoc = By.id("SubmitCreate");
	private static By enterValidEmailLoc=By.id("email");
	private static By enterValidPassword=By.id("passwd");
	private static By clickOnSigninLoc=By.id("SubmitLogin");
	private static By getErrorMsgLoc=By.xpath("//li[text()='Authentication failed.']");
	private static By getPageHeaderLoc=By.xpath("//h1[text()='My account']");
	
	public static void enterEmail(WebDriver driver, String email) {
		driver.findElement(enterEmailLoc).sendKeys(email);
	}

	public static void clickOnCreateAccount(WebDriver driver) {
		driver.findElement(createAccLoc).click();
	}
	public static void enterValidEmailAddresss(WebDriver driver,String emailid) {
		driver.findElement(enterValidEmailLoc).sendKeys(emailid);
	}
	
	public static void enterValidPassword(WebDriver driver,String password) {
		driver.findElement(enterValidPassword).sendKeys(password);
	}
	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(clickOnSigninLoc).click();
	}
	public static void getErrorText(WebDriver driver) {
		WebElement text=driver.findElement(getErrorMsgLoc);
		String errorMsg=text.getText();
		System.out.println(errorMsg);
	}
	public static void getPageHeader(WebDriver driver) {
		String expectedMsg="My account";
		WebElement headerText=driver.findElement(getPageHeaderLoc);
		String actualMsg=headerText.getText();
	Assert.assertEquals(expectedMsg, actualMsg);
		
	}
}

