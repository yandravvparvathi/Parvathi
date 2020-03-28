
  package com.cts.AutomationPages;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver;


  
  public class SearchPage { 
	  private  By topsIcon = By.linkText("Tops" );
	  private  By mediumIcon = By.xpath("//input[@value=\"2_1\"]" );
	  private  By sleeveIcon = By.id("layered_id_feature_17" );
	 // private  By searchDressLoc=By.xpath("(//a[@title='Printed Summer Dress'])[5]");
	  private  By clickImageLoc=By.xpath("(//img[@class='replace-2x img-responsive'])[15]");
	  private  By DressImageLoc=By.xpath("(//img[@title='Printed Summer Dress'])[2]");
	  private  By plusLoc=By.xpath("//i[@class='icon-plus']");
	 private  By searchLoc=By.id("search_query_top");
	 private  By searchButtonLoc=By.xpath("//button[@name='submit_search']");
	 private WebDriver driver;
	 public SearchPage(WebDriver driver) {
			this.driver=driver;
		}
	 
	 public  void searchLoc(String value) {
		 driver.findElement(searchLoc).sendKeys(value);
	 }
	 
	 public  void SearchButtonLoc() {
		 driver.findElement(searchButtonLoc).click();
	 }
	  public  void clicktopsIcon() {
	
		  driver.findElement(topsIcon).click();
		  }
	  public  void clickmediumIcon() {
		  
		  driver.findElement(mediumIcon).click();
	  }
	  public  void clicksleeveIcon() {
		  driver.findElement(sleeveIcon).click();
	  }
		
	  public  void clickimage()
	  {
	  	driver.findElement(clickImageLoc).click();
	  }

	  public  void plusicon()
	  {
	  	driver.findElement(plusLoc).click();
	  }
	  public  void dressimage()
	  {
	  	driver.findElement(DressImageLoc).click();
	  }
  
  }
 
