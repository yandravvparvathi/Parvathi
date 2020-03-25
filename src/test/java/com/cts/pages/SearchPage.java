
  package com.cts.pages;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver;


  
  public class SearchPage { 
	  private static By topsIcon = By.linkText("Tops" );
	  private static By mediumIcon = By.xpath("//input[@value=\"2_1\"]" );
	  private static By sleeveIcon = By.id("layered_id_feature_17" );
	 // private static By searchDressLoc=By.xpath("(//a[@title='Printed Summer Dress'])[5]");
	  private static By clickImageLoc=By.xpath("(//img[@class='replace-2x img-responsive'])[15]");
	  private static By DressImageLoc=By.xpath("(//img[@title='Printed Summer Dress'])[2]");
	  private static By plusLoc=By.xpath("//i[@class='icon-plus']");
	 private static By searchLoc=By.id("search_query_top");
	 private static By searchButtonLoc=By.xpath("//button[@name='submit_search']");
	 
	 
	 public static void searchLoc(WebDriver driver,String value) {
		 driver.findElement(searchLoc).sendKeys(value);
	 }
	 
	 public static void SearchButtonLoc(WebDriver driver) {
		 driver.findElement(searchButtonLoc).click();
	 }
	  public static void clicktopsIcon(WebDriver driver) {
	
		  driver.findElement(topsIcon).click();
		  }
	  public static void clickmediumIcon(WebDriver driver) {
		  
		  driver.findElement(mediumIcon).click();
	  }
	  public static void clicksleeveIcon(WebDriver driver) {
		  driver.findElement(sleeveIcon).click();
	  }
		
	  public static void clickimage(WebDriver driver)
	  {
	  	driver.findElement(clickImageLoc).click();
	  }

	  public static void plusicon(WebDriver driver)
	  {
	  	driver.findElement(plusLoc).click();
	  }
	  public static void dressimage(WebDriver driver)
	  {
	  	driver.findElement(DressImageLoc).click();
	  }
  
  }
 
