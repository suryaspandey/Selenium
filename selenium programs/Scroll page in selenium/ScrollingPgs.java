package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingPgs {
	public WebDriver Driver;
	
	public ScrollingPgs() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		Driver = new ChromeDriver();
	}
	
	@Test
	public void ScrollPgs() throws InterruptedException {
		Driver.get("https://www.seleniumhq.org/download/");
		Driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// scrolls 5000px. not a good option
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		jse.executeScript("window.scrollBy(0,5000)", "");
		
		// alternative
		
		WebElement element =  Driver.findElement(By.xpath("//div[text() = \"Selenium XML Formatter\"]"));
		//scrolltoview the element(element described by xpath)
		((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	

}


