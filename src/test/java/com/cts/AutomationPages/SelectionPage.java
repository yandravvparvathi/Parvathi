package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectionPage {
	private WebDriver driver;
	private By MoveLoc=By.linkText("Women");
	private By itemLoc=By.linkText("Blouses");
public SelectionPage(WebDriver driver) {
	this.driver=driver;
}
public void clickWomenMenu() {
	WebElement element=driver.findElement(MoveLoc);
	Actions action =new Actions(driver);
	action.moveToElement(element).build().perform();
	
	
}
public void clickOnItem() {
driver.findElement(itemLoc).click();
}
}