package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JS_Executer {

public WebDriver driver;
	
	public JS_Executer() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
@Test
	
	
	public void dropdown_list_selection() throws InterruptedException {
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//ul[@class= 'ch__profileOverlayTabs ch__capitalize']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','display:none;');", e);
		// Dislpay property is set to block by default. Changing it to none. hence the dropdown for "More+" disappears for 5 sec.
		
		Thread.sleep(5000);
		

		
		WebElement e1 = driver.findElement(By.xpath("//ul[@class= 'ch__profileOverlayTabs ch__capitalize']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','display:block;');", e1);
		// Display property again changed to block. all dropdown options can be seen on mouse hover, for 5 sec
		
		Thread.sleep(3000);
		
		// after 5 sec "International Flights" option is clicked and the respective page opens.
		 driver.findElement(By.linkText("International Flights")).click();
		 
		
}
}
