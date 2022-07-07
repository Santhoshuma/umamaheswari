package com.windowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\seleniumcourse"
				+ "\\SeleniumTestingCourse\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement AB = driver.findElement(By.xpath("//a[text() = 'Amazon Basics']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(AB).build().perform();
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement Cp = driver.findElement(By.xpath("//a[text() = 'Coupons']"));
				
		act.contextClick(Cp).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

		WebElement ST = driver.findElement(By.xpath("//a[text() = 'Shopper Toolkit']"));
		
		act.contextClick(ST).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);

		WebElement PS = driver.findElement(By.xpath("//a[text() = 'Pet Supplies']"));
		
		act.contextClick(PS).build().perform();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		String PW = driver.getWindowHandle();
		
		System.out.println(PW);
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		for (String cp: AllWindows){
			
			String title = driver.switchTo().window(cp).getTitle();
			
			System.out.println(title);
			
			}
		String title3 = "Amazon.com: Welcome to Amazon";
		
		for (String cp:AllWindows) {
			
			if(driver.switchTo().window(cp).getTitle().contentEquals(title3)) {
				
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		TakesScreenshot sc1 = (TakesScreenshot) driver;
		
		File source1 = sc1.getScreenshotAs(OutputType.FILE);
		
		File save1 = new File("C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\Screenshot\\pic3.png");
		
		FileHandler.copy(source1, save1);
		
		
		String title2 = "Amazon Coupons @ Amazon.com";
		
		for (String cp :AllWindows) {
			
			if(driver.switchTo().window(cp).getTitle().contentEquals(title2)) {
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
		TakesScreenshot sc2 = (TakesScreenshot) driver;
		
		File source2 = sc2.getScreenshotAs(OutputType.FILE);
		
		File save2 = new File("C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\Screenshot\\pic4.png");
		
		FileHandler.copy(source2, save2);
		
		
		String title1 = "Amazon.com: Amazon Basics";
		
		for (String cp :AllWindows) {
			
			if(driver.switchTo().window(cp).getTitle().contentEquals(title1)) {
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
		TakesScreenshot sc3 = (TakesScreenshot) driver;
		
		File source3 = sc3.getScreenshotAs(OutputType.FILE);
		
		File save3 = new File("C:\\Users\\santh\\seleniumcourse\\SeleniumTestingCourse\\Screenshot\\pic5.png");
		
		FileHandler.copy(source3, save3);
				
		for (String cp: AllWindows) {
			
			if(!cp.equals(PW)) {
				
				driver.switchTo().window(cp);
				
				driver.close();
			}
		}
		}	

		

	}

		
		

