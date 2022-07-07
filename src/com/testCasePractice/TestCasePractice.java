package com.testCasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.instagram.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		
		email.sendKeys ("uma1234");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("Maheswari");
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		
		button.click();
		
		//driver.navigate().back();
		
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		
		signup.click();
		
		driver.close();
		
	}

}
