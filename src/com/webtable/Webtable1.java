package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable1 {
	
	
	
	
	//----hybird xpth-------------
	//*[@id="search"]/div/div/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a
	
	
	//----------Absoult xpth-----------
	//div[@id='search']/div/div/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mailt\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+14+pro&sprefix=iphone+%2Caps%2C321&ref=nb_sb_ss_deep-retrain-50-ops-acceptance_3_7");;
		driver.manage().window().maximize();
		WebElement mobile = driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a"));
		mobile.click();
		
		
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='atc-declarative']"));
		Actions Act = new Actions(driver);
		Act.contextClick(cart).build().perform();
		
		
		
		
	}

}
