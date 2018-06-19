package com.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click_OPerations {
	public WebDriver driver;
	
	private Click_OPerations() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
			driver = new ChromeDriver();

	}
	@Test
	public void clickop() {
		
		driver.get("https://www.deal4loans.com/credit-score/find-your-cibil-score.php?c3JjPWRpcmVjdHdlYg==");
		driver.manage().window().maximize();
		//.click allows to select an element from dropdown.
		driver.findElement(By.xpath("//option[@value = 'Bangalore']")).click();
		
		WebElement name =  driver.findElement(By.name("conditions"));
		//name.click();
		
		boolean select  = name.isSelected();
		System.out.println("CheckBox selected?:" + select);
		name.click();
		//WebElement submit = driver.findElement(By.name("submitbtn"));
		//submit.click();
		boolean submit_select  = name.isSelected();
		System.out.println("CheckBox selected?:" + submit_select);
		driver.findElement(By.name("submitbtn")).click();
		
//		WebElement mobile =  driver.findElement(By.name("mobile"));
//		mobile.click();
//		
//		mobile.isEnabled();
//		
//		System.out.println("textBox Enabled?:" + mobile);
		
		
//		String a = window.open("https://www.deal4loans.com/loans/sbi/sbi-platinum-credit-card-sbi-card/","_blank");
//		((JavascriptExecutor)driver).executeScript(a);
		driver.get("https://www.deal4loans.com/loans/sbi/sbi-platinum-credit-card-sbi-card/");
		boolean display = driver.findElement(By.name("Net_Salary_error")).isDisplayed();
		System.out.println("Is error msg printed?"+ display);
		
		
		
		
	}
	
	

}
