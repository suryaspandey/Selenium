package com.selenium.programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Multiple_Windows {

public WebDriver driver;
	
	public Handling_Multiple_Windows() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	@Test
	public void mul_win() throws InterruptedException {
		driver.get("https://www.deal4loans.com/credit-score/find-your-cibil-score.php?c3JjPWRpcmVjdHdlYg==");
		driver.findElement(By.linkText("Privacy policy")).click();
		// we get 2 windows here. to count the no of windows:
		Set<String> browser = driver.getWindowHandles();
		System.out.println("Window size is "+ browser);
		
		// before going to the new page, entering some data in the current page
		
		driver.findElement(By.id("first_name")).sendKeys("Hello");
		Thread.sleep(4000);
		
		for(String browsers:browser) {
			System.out.println("Browser id is "+browser);
		// for switching between the windows or activating a window use:
			driver.switchTo().window(browsers);
			// title of second page, since first page is already open
			if(driver.getTitle().equals("Privacy Policy - Deal4loans.com's Services | Online Loan Application And Information")) {
			// if you are on 2nd page , perform the action of clicking a link on second page(any action can be performed)
			driver.findElement(By.xpath("//p/a[@href  ='http://www.deal4loans.com']")).click();
			Thread.sleep(4000);
			driver.close(); // closes the current browser
			Thread.sleep(4000);
			
		}
		
		
	}
	
	
	Set<String> browser1 = driver.getWindowHandles();
	System.out.println("Window size is "+ browser1);
	
	
	
	
	for(String browsers:browser1) {
		System.out.println("Browser id is "+browser1);
		driver.switchTo().window(browsers);
		// url of 1st page, since second page is already closed
		if(driver.getCurrentUrl().equals("https://www.deal4loans.com/credit-score/find-your-cibil-score.php?c3JjPWRpcmVjdHdlYg==")) {
		// if you are on 1st page , perform the action of clearing the text
		driver.findElement(By.id("first_name")).clear();
		Thread.sleep(4000);
		driver.quit(); // closes all tabs
		}
	
	}
}
}

