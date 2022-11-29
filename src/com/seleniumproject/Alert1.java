package com.seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		button1.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		
		button2.click();
		
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		button3.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
//        WebElement button4 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		
//		button4.click();
//		
//		WebElement button5 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		button5.click();
//		
//		
//		Alert alert3= driver.switchTo().alert();
//		
//		alert3.sendKeys("text");
//		System.out.println(alert3);
//		
		
		
	}

}
