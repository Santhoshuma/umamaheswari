package com.dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;


public class DragAndDropPractice {
	
	public static void main(String[] args) {
		
		String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement from4 = driver.findElement(By.xpath("//div[@id='box4']"));
		
		WebElement to4 = driver.findElement(By.xpath("//div[@id='box104']"));
		
		Actions act4 = new Actions (driver);
		
		act4.dragAndDrop(from4, to4).build().perform();
		
		
		WebElement from5 = driver.findElement(By.xpath("//div[@id='box5']"));
		
		WebElement to5 = driver.findElement(By.xpath("//div[@id='box105']"));
		
		Actions act5 = new Actions (driver);
		
		act5.dragAndDrop(from5, to5).build().perform();
		
		
		WebElement from6 = driver.findElement(By.xpath("//div[@id='box6'] "));
		
		WebElement to6 = driver.findElement(By.xpath("//div[text()='Italy'] "));
		
		Actions act6 = new Actions (driver);
		
		act6.dragAndDrop(from6, to6).build().perform();
		
		
		WebElement from1 = driver.findElement(By.xpath("//div[@id='box1'] "));
		
		WebElement to1 = driver.findElement(By.xpath("//div[text()='Norway'] "));
		
		Actions act1 = new Actions (driver);
		
		act1.dragAndDrop(from1, to1).build().perform();
		
		
		WebElement from7 = driver.findElement(By.xpath("//div[@id='box7'] "));
		
		WebElement to7 = driver.findElement(By.xpath("//div[@id='box107'] "));
		
		Actions act7 = new Actions (driver);
		
		act7.dragAndDrop(from7, to7).build().perform();
		
		
		WebElement from2 = driver.findElement(By.xpath("//div[@id='box2']"));
		
		WebElement to2 = driver.findElement(By.xpath("//div[@id='box102']"));
		
		Actions act2 = new Actions (driver);
		
		act2.dragAndDrop(from2, to2).build().perform();
		
		
		WebElement from3 = driver.findElement(By.xpath("//div[@id='box3'] "));
		
		WebElement to3 = driver.findElement(By.xpath("//div[@id='box103'] "));
		
		Actions act3 = new Actions (driver);
		
		act3.dragAndDrop(from3, to3).build().perform();
		
				
		
	}


		
	}


