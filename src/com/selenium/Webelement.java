package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);

		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		
	}

}
