package com.framePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demo.automationtesting.in/Frames.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse"
				+ "\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id = 'singleframe']"));
		
		driver.switchTo().frame(frame1);
		
		WebElement textbox1 = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		
		textbox1.sendKeys("umamaheswari");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement IframeinIframe = driver.findElement(By.xpath("//a[@href = '#Multiple']"));
		
		IframeinIframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@style = 'float: left;height: 250px;width: 400px']"));
	
		driver.switchTo().frame(innerframe);
		
		WebElement textbox2 = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
	
		textbox2.sendKeys("Umamaheswari");
		
		driver.switchTo().defaultContent();
		
		WebElement webtable = driver.findElement(By.xpath("//a[@href = 'WebTable.html']"));
	
		webtable.click();
		
		
	}

}
