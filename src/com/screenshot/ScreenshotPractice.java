package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenshotPractice {
	
	public static void main(String[] args) throws IOException {
	
	String url = "https://www.facebook.com/";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.get(url);
	
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	
	email.sendKeys ("8015891720");
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	
	password.sendKeys("Java2022");
	
	WebElement button = driver.findElement(By.xpath("//button[text()='Log In']"));
	
	button.click();
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File save = new File("C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\Screenshot\\pic1.png");
	
	FileHandler.copy(source, save);
	
	
}

}