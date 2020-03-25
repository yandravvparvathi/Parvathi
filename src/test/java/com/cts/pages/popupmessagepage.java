package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class popupmessagepage {
	private static By addedwishlistLoc=By.id("wishlist_button");
	public static String wishlist(WebDriver driver)
	{
		String wishlist = driver.findElement(addedwishlistLoc).getText();
		
		return wishlist;
		
	}
}
