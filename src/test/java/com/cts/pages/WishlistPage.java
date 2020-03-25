package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	private static By wishlistLoc=By.xpath("//a[@title='Add to my wishlist']");


	public static void addToWishlist(WebDriver driver)
	{
		driver.findElement(wishlistLoc).click();
	}
	

}