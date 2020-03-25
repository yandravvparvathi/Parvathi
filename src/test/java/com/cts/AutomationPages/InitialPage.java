package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InitialPage {
private  By moveLoc=By.xpath("(//img[@alt='Blouse'])[1]");
private  By AddLoc=By.xpath("(//a[@title='Add to cart'])[2]");
private  By ProceedLoc=By.xpath("//a[@title='Proceed to checkout']");
private WebDriver driver;
public InitialPage(WebDriver driver)
{
	this.driver = driver;
}
	public  void moveToImage() {
		WebElement s= driver.findElement(moveLoc);
		Actions action=new Actions(driver);
		action.moveToElement(s).build().perform();
	}
	
public  void clickOnAddToCart() {
	driver.findElement(AddLoc).click();

}
public  void clickOnProceed() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(ProceedLoc).click();
}
}
