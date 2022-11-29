package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		select.selectByIndex(4);
		select.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		select.selectByValue("1");
		Thread.sleep(2000);
		select.selectByIndex(3);
		
		
		//select.selectByVisibleText("UFT/QTP");
		//Thread.sleep(2000);
		//select.selectByIndex(2);
		
		//WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		//Select mul = new Select(multiple);
		//mul.selectByValue("4");
		
		//boolean mulit_not = mul.isMultiple();
		//System.out.println("Multiple or not:"+ mulit_not);
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
