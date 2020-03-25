package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUspPage {
	private  By subjectHeadingLoc = By.name("id_contact");
	private  By enterEmailLoc = By.id("email");
	private  By enterOrderLoc=By.id("id_order");
	private  By messageLoc=By.id("message");
	private  By SendLoc=By.xpath("//span[text()='Send']");
	private WebDriver driver;
	
	public ContactUspPage(WebDriver driver) {
		this.driver=driver;
	}

	public  void chooseHeading( String subject) {
		WebElement headingEle = driver.findElement(subjectHeadingLoc);
		Select selectHeading = new Select(headingEle);
		selectHeading.selectByVisibleText(subject);
	}

	public  void enterEmail(WebDriver driver, String Email) {
		driver.findElement(enterEmailLoc).sendKeys(Email);
	}
	public  void enterOrder(WebDriver driver,String order) {
		driver.findElement(enterOrderLoc).sendKeys(order);
	}
	public  void uploadFile(WebDriver driver, String file) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('filename')[0].innerHTML='"+file+"'");
		
	}
	public  void enterMessage(WebDriver driver,String message) {
		driver.findElement(messageLoc).sendKeys(message);
	}
	public  void clickOnSend(WebDriver driver) {
		driver.findElement(SendLoc).click();
	}
}
