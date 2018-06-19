package com.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsSelection {
	public WebDriver driver;
	
	public DropDownsSelection(){
	System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
	driver = new ChromeDriver();

	}
	@Test
	public void dropdown() {
		
		driver.get("https://www.deal4loans.com/credit-score/find-your-cibil-score.php?c3JjPWRpcmVjdHdlYg==");
		
		driver.manage().window().maximize();
		//selecting a value from dropdown using " click()"
		driver.findElement(By.xpath("//option[@value = '7']")).click();;
		
		// select a value when a parent tag is select
		// "state" has parent tag as select
		WebElement a = driver.findElement(By.id("state"));
		Select s = new Select(a);
		
		//select by index
	//	s.selectByIndex(1);
		
		//select by value
	//	s.selectByValue("30");
		
		// select by visible text on UI
		s.selectByVisibleText("Maharashtra");
		// validate which element is selected from dropdown
		String val = s.getFirstSelectedOption().getText();
		System.out.println("Selected value from dropdown is "+val);
		
		List<WebElement> state = driver.findElements(By.xpath("//select[@id ='state']//option"));
		System.out.println("Count of states" +state.size());
		for(WebElement states:state) {
			System.out.println("Selected values from dropdown is "+ states.getText());
			
		}
		//
		
	}
}
