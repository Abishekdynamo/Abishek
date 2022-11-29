package com.ipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ipt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
	List<WebElement> as = driver.findElements(By.xpath("//h4[@class='product-product']"));
	System.out.println(as.size());
	
//	for (WebElement all : as) {
//		Dimension size1 = all.getSize();
//		System.out.println(size1);
//
//	}
	
		
		
		
	}

}
