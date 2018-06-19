package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Mouse_Interactions {
	
	public WebDriver driver ;
	@FindBy(xpath = "//span[@class = 'text-wrap']/span[@class ='menu-item-text']/span[@class='menu-text' and text() = 'TRAININGS']") // get the parent element for which mouse hover is going to be performed
	private WebElement forum_link;
	
	public Mouse_Interactions(){
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	@Test
	public void mousehover() throws InterruptedException {
		
		driver.get("http://toolsqa.com/selenium-webdriver/page-object-pattern-model-page-factory/"); 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(forum_link).perform();
		Thread.sleep(5000);
		// get the element on which the click operation is to be performed after mouse hover
		driver.findElement(By.xpath("//span[@class = 'text-wrap']/span[@class ='menu-item-text']/span[@class='menu-text' and text() = 'Selenium Online Training']")).click();
		Thread.sleep(5000);
		
		
		
	}
	
	
	@AfterSuite
	public void quit(){
		
		driver.quit();
	}

	
}
