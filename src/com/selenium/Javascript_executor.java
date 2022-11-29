package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor {
	
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI3bDDz6rG-gIV0TArCh1hqwsaEAAYASAAEgIH9vD_BwE");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JavascriptExecutor je =(JavascriptExecutor) driver;
	Thread.sleep(1000);
	je.executeScript("window.scroll(0,5000)","");
	
	
	
	
	
	
}

}
