package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_task {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions s = new Actions(driver);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("diwali");
		s.doubleClick(search).build().perform();
		
		Robot ab = new Robot();
		
		/*ab.keyPress(KeyEvent.VK_COPY);
		ab.keyRelease(KeyEvent.VK_COPY);
		
		ab.keyPress(KeyEvent.VK_CLEAR);
		ab.keyRelease(KeyEvent.VK_CLEAR);
		
		ab.keyPress(KeyEvent.VK_PASTE);
		ab.keyRelease(KeyEvent.VK_PASTE);
		
		ab.keyPress(KeyEvent.VK_ENTER);
		ab.keyRelease(KeyEvent.VK_ENTER);*/
		
		ab.keyPress(KeyEvent.VK_CONTROL);
		ab.keyPress(KeyEvent.VK_A);
		ab.keyRelease(KeyEvent.VK_CONTROL);
		ab.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		ab.keyPress(KeyEvent.VK_CONTROL);
		ab.keyPress(KeyEvent.VK_X);
		ab.keyRelease(KeyEvent.VK_CONTROL);
		ab.keyRelease(KeyEvent.VK_X);
		
		Thread.sleep(2000);
		ab.keyPress(KeyEvent.VK_CONTROL);
		ab.keyPress(KeyEvent.VK_V);
		ab.keyRelease(KeyEvent.VK_CONTROL);
		ab.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
	
		ab.keyPress(KeyEvent.VK_ENTER);
		ab.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
