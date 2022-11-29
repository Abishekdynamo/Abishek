package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Hybird_Xpath {
	
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile+phone&sprefix=mobil%2Caps%2C416&ref=nb_sb_ss_pltr-ranker-20mins_2_5");
		driver.manage().window().maximize();
		
		
		/*WebElement absolute_xpath = driver.findElement(By.xpath("/html/body/div/div/div/div/div/span/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/h2/a"));
		
		absolute_xpath.click();*/
		Thread.sleep(1000);
		WebElement Hybird_xpath = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		
		Hybird_xpath.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
