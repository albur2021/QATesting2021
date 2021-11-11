package com.selenium.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
class AppTest {
  
    public static void main(String[] args) {
		// Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//Firefox - Firefoxdriver -> Methods
		
		
		//1. *** FireFox driver
//		System.setProperty("webdriver.gecko.driver","/Users/almaz/Downloads/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		//2. *** Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/almaz/Downloads/edgedriver_mac64/msedgedriver");
//		WebDriver driver = new EdgeDriver(); 
		
		//2. *** Chrome driver
		//chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver");
		//WebDriver Interface calling + calling ChromeDriver Class
		// to combinate Selenium interface methods and object out of Selenium ChromeDriver Class
		WebDriver driver = new ChromeDriver();

	
		
		

		
		
//	
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(	driver.getCurrentUrl());
		driver.close();//close current window, also you can't use both
		//driver.quit();//close all associated windows
		///Users/almaz/Downloads/edgedriver_mac64/msedgedriver
		
	
		
		
	}
}
