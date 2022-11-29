package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_methods {
	public static void main(String[] args) throws AWTException, InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions s = new Actions(driver);
		
		WebElement image = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
		s.contextClick(image).build().perform();
		
	Robot a =new Robot();
	a.keyPress(KeyEvent.VK_DOWN);
	a.keyRelease(KeyEvent.VK_DOWN);	
	
	Thread.sleep(2000);
	
	a.keyPress(KeyEvent.VK_DOWN);
	a.keyRelease(KeyEvent.VK_DOWN);
	
	a.keyPress(KeyEvent.VK_PAGE_DOWN);
	a.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	a.keyPress(KeyEvent.VK_DOWN);
	a.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		
		
		
	}

}
