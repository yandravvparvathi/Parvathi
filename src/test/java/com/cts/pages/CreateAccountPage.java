package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	private static By clickOnRadioButtonLoc = By.id("id_gender2");
	private static By enterFirstNameLoc = By.id("customer_firstname");
	private static By enterLastNameLoc = By.id("customer_lastname");
	private static By enterPasswordLoc = By.id("passwd");
	private static By addressLoc = By.id("address1");
	private static By cityLoc = By.id("city");
	private static By selectStateLoc = By.id("id_state");
	private static By postCodeloc = By.id("postcode");
	private static By countryLoc = By.id("id_country");
	private static By mobileNum = By.id("phone_mobile");
	private static By address1Loc = By.id("alias");
	private static By registerLoc = By.id("submitAccount");
	private static By selectDayLoc = By.id("days");
	private static By selectMonthLoc = By.id("months");
	private static By selectYearLoc = By.id("years");

	public static void fillRegForm(WebDriver driver, String firstname, String lastname, String password, String address,
			String city, String pincode, String mobilenum, String address1) {

		driver.findElement(clickOnRadioButtonLoc).click();
		driver.findElement(enterFirstNameLoc).sendKeys(firstname);

		driver.findElement(enterLastNameLoc).sendKeys(lastname);
		driver.findElement(enterPasswordLoc).sendKeys(password);
		driver.findElement(addressLoc).sendKeys(address);
		driver.findElement(cityLoc).sendKeys(city);
		Select state = new Select(driver.findElement(selectStateLoc));
		state.selectByVisibleText("Indiana");

		Select day = new Select(driver.findElement(selectDayLoc));
		day.selectByVisibleText("8  ");
		Select month = new Select(driver.findElement(selectMonthLoc));
		month.selectByVisibleText("August ");
		Select year = new Select(driver.findElement(selectYearLoc));
		year.selectByVisibleText("1998  ");
		driver.findElement(postCodeloc).sendKeys(pincode);
		Select country = new Select(driver.findElement(countryLoc));
		country.selectByVisibleText("United States");

		driver.findElement(mobileNum).sendKeys(mobilenum);
		driver.findElement(address1Loc).sendKeys(address1);
		driver.findElement(registerLoc).click();

	}
}
