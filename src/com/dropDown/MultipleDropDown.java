package com.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	
	public static void main (String[] args) throws InterruptedException {
		
String url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse"
				+ "\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		button.click();
		
		Thread.sleep(4000);
		
		WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		FN.sendKeys("Selenium");
		
		WebElement LN = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		LN.sendKeys("Account");
		
		WebElement PH = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		
		PH.sendKeys("4243529584");
		
		WebElement PW = driver.findElement(By.xpath("//input[@data-type = 'password']"));
		
		PW.sendKeys("Practice");
		
		Thread.sleep(3000);
		
		WebElement Month = driver.findElement(By.xpath("//select[@title = 'Month']"));
		
		Select sc1 = new Select (Month);
		
		sc1.selectByVisibleText("Oct");
		
		WebElement Date = driver.findElement(By.xpath("//select[@id = 'day']"));
		
		Select sc2 = new Select (Date);
		
		sc2.selectByValue("20");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title = 'Year']"));
		
		Select sc3 = new Select (Year);
		
		sc3.selectByValue("1987");
		
		WebElement Female = driver.findElement(By.xpath("//label[text() = 'Female']"));
		
		Female.click();
		
		WebElement Button = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
		
		Button.click();
	}

}
