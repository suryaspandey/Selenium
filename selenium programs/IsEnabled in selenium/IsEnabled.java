package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsEnabled {
public WebDriver driver;
	
	 public IsEnabled() {
		// TODO Auto-generated constructor stub
	
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
			driver = new ChromeDriver();

	}
	@Test
	public void clickop() {
	
		driver.get("https://www.deal4loans.com/loans/sbi/sbi-platinum-credit-card-sbi-card/");
		boolean display = driver.findElement(By.name("Net_Salary_error")).isDisplayed();
		System.out.println("Is error msg printed?"+ display);
	}

}
// error because when the page opens, no element by name " Net_Salary_error " is found.