package com.selenium;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	
	
	Actions as=new Actions(driver);
	
	WebElement From = driver.findElement(By.xpath("//div[@id='box5']"));
	WebElement To = driver.findElement(By.xpath("//div[@id='box105']"));
	as.clickAndHold(From).moveToElement(To).release().build().perform();
	
	Thread.sleep(2000);
	
	WebElement from_wash = driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement to = driver.findElement(By.xpath("//div[@id='box106']"));
	as.dragAndDrop(from_wash, to).build().perform();
	
	


	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
