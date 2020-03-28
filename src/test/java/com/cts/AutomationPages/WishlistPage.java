package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
private static By wishlistLoc=By.xpath("//a[@title='Add to my wishlist']");
private WebDriver driver;
	
	public WishlistPage(WebDriver driver) {
		this.driver=driver;
	}
	


	public static void addToWishlist(WebDriver driver)
	{
		driver.findElement(wishlistLoc).click();
	}
	

}