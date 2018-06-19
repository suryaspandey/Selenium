package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Assertions_TestNG {
	
	public WebDriver driver;
	
	public Assertions_TestNG() {
		
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();

	}
	@Test
	public void Assertions() throws InterruptedException {
		driver.get("https://www.deal4loans.com/credit-score/find-your-cibil-score.php?c3JjPWRpcmVjdHdlYg==");
	WebElement a = driver.findElement(By.xpath("//input[@type='checkbox']"));
	
	a.click();
	boolean b = a.isSelected();
	
	
	System.out.println(b);
	
	Assert.assertTrue(b, "Checkbox is not selected");
	Thread.sleep(3000);
	
	
	
	driver.get("https://www.deal4loans.com/Contents_Credit_Card_Mustread.php");
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	Thread.sleep(3000);
	String error = driver.findElement(By.className("hintanchorqa")).getText();
	
	Assert.assertEquals(error, "Fill Your Name."); // compares the actual and the expected error msg
	Thread.sleep(3000);
	}
	@AfterSuite
	public void quit() {
		driver.quit();
	}

}
