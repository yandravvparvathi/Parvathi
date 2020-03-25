package com.cts.AutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteIconPage {
 private By deleteLoc=By.xpath("//a[@title='Delete']");
 private WebDriver driver;
 public deleteIconPage(WebDriver driver) {
	 this.driver=driver;
 }
 public  void clickOnDelete(){
	 driver.findElement(deleteLoc).click();
 }
}
