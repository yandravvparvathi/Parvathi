package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class popupmessagepage {
	private  By addedwishlistLoc=By.id("wishlist_button");
	private WebDriver driver;
	public popupmessagepage(WebDriver driver) {
		this.driver=driver;
	}
	public  String wishlist()
	{
		String wishlist = driver.findElement(addedwishlistLoc).getText();
		
		return wishlist;
		
	}
}
