package com.selenium;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
     JavascriptExecutor js = (JavascriptExecutor) driver;
     Thread.sleep(2000);
     js.executeScript("window.scroll(0,4560)", "");
     
     
     WebElement sourceFile = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-none shogun-widget card-lite image-shoveler aui-desktop fresh-shoveler image-shoveler')]"));
     File source=sourceFile.getScreenshotAs(OutputType.FILE);
     File destinationfile = new File("C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Evidence\\amazon.png");
     FileHandler.copy(source, destinationfile);
 	
     
     
     
     
	
	
	
	

	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

	private static JavascriptExecutor JavascriptExecutor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
