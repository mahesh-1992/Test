package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	WebDriver driver;
	
	@Test
	public void test1()
	{ 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn-automation.com/");
		String title = driver.getTitle();
		boolean value = title.contains("Selenium");
		System.out.println(value);
		
		}
	
	@Test
	public void test2()
	{
		driver.quit();
	}

}
