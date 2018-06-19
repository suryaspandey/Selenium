package com.selenium.programs;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Drop_Down {

	public WebDriver driver;
	
	
	public Drop_Down() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	
	public void drop_down() {
		driver.get("https://www.deal4loans.com/loans/sbi/sbi-platinum-credit-card-sbi-card/");
		List<WebElement> cities =  driver.findElements(By.xpath("//p/select[@name = 'City']//option"));
		System.out.println("no of cities:"+cities.size());
		
		for(WebElement city :cities) {
			System.out.println(city.getText());
			if(city.getText().equals("Bangalore"))
			{
				city.click();
				break;
			}
		}
	}
}


// OUTPUT: City Bangalore is selected in the dropdown menu.

