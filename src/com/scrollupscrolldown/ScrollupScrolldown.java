package com.scrollupscrolldown;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollupScrolldown {
	
	
	public static void main (String[] args ) throws InterruptedException, IOException {
		
		String url = "https://www.amazon.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse"
				+ "\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		JavascriptExecutor je= (JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,1500);");
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File save = new File("C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\Screenshot\\pic2.png");
		
		FileHandler.copy(source, save);
		
		je.executeScript("window.scrollBy(0,-1500);");
	}

}
