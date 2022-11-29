package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Abishekdynamo");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abishek123456789!!");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(1000);
		
		WebElement location = driver.findElement(By.id("location"));
		Select types = new Select(location);
		types.selectByIndex(5);
		
		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select types1 = new Select(Hotels);
		types1.selectByVisibleText("Hotel Hervey");
		
		WebElement rooms = driver.findElement(By.name("room_type"));
		Select types2 =new Select(rooms);
		types2.selectByVisibleText("Super Deluxe");
		Thread.sleep(2000);
		
		WebElement roomtypes = driver.findElement(By.id("room_nos"));
		Select types3= new Select(roomtypes);
		types3.selectByVisibleText("10 - Ten");
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("01/10/2022");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("05/10/2022");
		
		WebElement count = driver.findElement(By.name("adult_room"));
		Select types4 = new Select(count);
		types4.selectByVisibleText("3 - Three");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select types5 = new Select(child);
		types5.selectByVisibleText("4 - Four");
		
		WebElement submitbutton = driver.findElement(By.id("Submit"));
		submitbutton.click();
		Thread.sleep(3000);
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		WebElement submit = driver.findElement(By.id("continue"));
		submit.click();
		Thread.sleep(4000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("Abishek");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("dynamo");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("11/50 Arcot main road porur");
		
		WebElement creditcardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditcardno.sendKeys("1600452178947458");
		
		WebElement ccno = driver.findElement(By.xpath("//select[contains(@name,'cc_type')]"));
		Select types6 = new Select(ccno);
		types6.selectByVisibleText("American Express");
		
		WebElement select_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select types7 = new Select(select_month);
		types7.selectByVisibleText("October");
		
		WebElement select_year = driver.findElement(By.id("cc_exp_year"));
		Select types8 = new Select(select_year);
		types8.selectByIndex(12);
		
		WebElement cc_no = driver.findElement(By.name("cc_cvv"));
	    cc_no.sendKeys("124");
	    
	    WebElement booknow = driver.findElement(By.id("book_now"));
	    booknow.click();
	  
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
