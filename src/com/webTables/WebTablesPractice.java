package com.webTables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesPractice {

	public static void main(String[] args) {
		
		String url = "";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);


	}

}
