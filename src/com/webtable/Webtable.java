package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		
       WebElement rowful = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[10]/td/input"));
		rowful.click();
		rowful.isSelected();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>row 10<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		WebElement rowful1 = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[10]/td[3]"));
		String text2 = rowful1.getText();
		System.out.println(text2);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>Row13<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

		List<WebElement> row13 = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[13]/td"));
		
		
		for (WebElement ht : row13) {
			
		String halftext = ht.getText();

		System.out.println(halftext);
			
	}
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<WebElement> colful = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[5]"));
		for (WebElement col5 : colful) {
			
			
			
			String cl = col5.getText();
			System.out.println(cl);
			
			
			
			
		}
		
				
		
		
		
	}
}
	

