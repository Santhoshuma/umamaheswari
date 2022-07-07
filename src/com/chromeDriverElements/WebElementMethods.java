package com.chromeDriverElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	
public static void main(String[] args) {
		
		String url = "https://www.instagram.com/";
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
	 // upcasting
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.get(url);
		
		WebElement un = driver.findElement(By.name("username"));
		
		un.sendKeys ("Uma1234");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("Maheswari");
		
		
				
		
}		

}
