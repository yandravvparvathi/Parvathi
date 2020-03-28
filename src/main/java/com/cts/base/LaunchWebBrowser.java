package com.cts.base;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LaunchWebBrowser {
	public static WebDriver driver;
	
	@Before
	public static void start(String browsername)
	{
		if(browsername.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "src/test/resources/driver/IEDriverServer.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
    
	}
	@After
	public static void endBrowser()
	{
		Date date = new Date();
		String dateStr = date.toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image" +dateStr+ ".png"));
		
		driver.quit();
	}

}
