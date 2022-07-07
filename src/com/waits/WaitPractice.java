package com.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse"
				+ "\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

	}

}
