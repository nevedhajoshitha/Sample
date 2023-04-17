package org.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Annotations {
	 public static WebDriver driver;
	
	@BeforeClass
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void Search() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("junit");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
		driver.close();
	}

}

