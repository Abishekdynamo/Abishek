package com.seleniumproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazontask {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Thread.sleep(2000);
	    js.executeScript("window.scroll(0,5200)", ""); 
	    TakesScreenshot Screenshot =(TakesScreenshot) driver;
	    File source=Screenshot.getScreenshotAs(OutputType.FILE);
	    File destinationfile = new File("C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Evidence\\amazon1.png");
	    FileHandler.copy(source, destinationfile);
	 	
		
		
		
	     
	     
	     
	     
	     
	     
	     
	     
		
		
		
		
		
		
	}
	
	
	

}
