package com.cts.AutomationPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SigninPage {
	private  By enterEmailLoc = By.id("email_create");
	private  By createAccLoc = By.id("SubmitCreate");
	private  By enterValidEmailLoc=By.id("email");
	private  By enterValidPassword=By.id("passwd");
	private  By clickOnSigninLoc=By.id("SubmitLogin");
	private  By getErrorMsgLoc=By.xpath("//li[text()='Authentication failed.']");
	private  By getPageHeaderLoc=By.xpath("//h1[text()='My account']");
	private WebDriver driver;
	public SigninPage(WebDriver driver) {
		this.driver=driver;
	}
	public  void enterEmail( String email) {
		driver.findElement(enterEmailLoc).sendKeys(email);
	}

	public  void clickOnCreateAccount() {
		driver.findElement(createAccLoc).click();
	}
	public  void enterValidEmailAddresss(String emailid) {
		driver.findElement(enterValidEmailLoc).sendKeys(emailid);
	}
	
	public  void enterValidPassword(String password) {
		driver.findElement(enterValidPassword).sendKeys(password);
	}
	public  void clickOnLogin() {
		driver.findElement(clickOnSigninLoc).click();
	}
	public  void getErrorText() {
		WebElement text=driver.findElement(getErrorMsgLoc);
		String errorMsg=text.getText();
		System.out.println(errorMsg);
	}
	public  void getPageHeader() {
		String expectedMsg="My account";
		WebElement headerText=driver.findElement(getPageHeaderLoc);
		String actualMsg=headerText.getText();
	Assert.assertEquals(expectedMsg, actualMsg);
		
	}
}

