package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_task {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		
		Actions drag = new Actions(driver);
		
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='post-2669']/div/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
		WebElement to = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		drag.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
	    WebElement To1 = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	    drag.clickAndHold(from1).moveToElement(To1).release().build().perform();
	    Thread.sleep(2000);
	    driver.close();
		
		
		
		
		
		
		
	}

}
