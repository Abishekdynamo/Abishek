package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpathdemo {
	
	
	
	public static void main(String[] args) {
		
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
	
		
		//implicit wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.NANOSECONDS);
		
	
		
	}
	
	
}
