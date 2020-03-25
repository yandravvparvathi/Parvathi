package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private static By clickOnsigninLoc = By.partialLinkText("Sign in");
	private static By searchLoc = By.name("search_query");
	private static By submitLoc = By.name("submit_search");
	private static By errorLoc = By.xpath("//p[@class='alert alert-warning']");
	private static By womenLoc = By.linkText("Women");
	private static By sortByLoc = By.xpath("//select[@id='selectProductSort']");
	private static By searchShirtLoc = By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]");

	public static void clickOnSignIn(WebDriver driver) {
		driver.findElement(clickOnsigninLoc).click();
	}

	public static void clickSearchIcon(WebDriver driver, String searchproduct) {
		driver.findElement(searchLoc).sendKeys(searchproduct);
	}

	public static void clickSubmitIcon(WebDriver driver) {
		driver.findElement(submitLoc).click();
	}

	public static String getSearchShirtDetail(WebDriver driver) {
		String shirtActualText = driver.findElement(searchShirtLoc).getText();

		return shirtActualText;
	}

	public static void enterInvalidDetails(WebDriver driver, String product) {
		driver.findElement(searchLoc).sendKeys(product);
		driver.findElement(submitLoc).click();
	}

	public static String getFailedmessage(WebDriver driver) {
		String err = driver.findElement(errorLoc).getText();
		return err;
	}

	public static void clickWomenIcon(WebDriver driver) {
		driver.findElement(womenLoc).click();
	}

	public static void clicksortbyicon(WebDriver driver, String value) {
		driver.findElement(sortByLoc).sendKeys(value);

	}
}
