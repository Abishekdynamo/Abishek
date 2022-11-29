package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
    TakesScreenshot Screenshot=(TakesScreenshot) driver;	
    File sourceFile=Screenshot.getScreenshotAs(OutputType.FILE);
    File destinationfile = new File("C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Evidence\\screenshot.png");
    FileHandler.copy(sourceFile, destinationfile);
    
	
	
	
	
	
		
	
	}

}
