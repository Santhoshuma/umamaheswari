package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchTesting {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	 // upcasting
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//driver.close();
		
		// driver.quit();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String cu = driver.getCurrentUrl();
		
		System.out.println(cu);
		
		
	
	
	}
	
	
}
