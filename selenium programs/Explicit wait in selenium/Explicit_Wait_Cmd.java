package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Wait_Cmd {
	public WebDriver driver;
	
	public Explicit_Wait_Cmd() {
		
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void waitcmd() {
		driver.get("https://www.makemytrip.com/daily-deals/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Sitelink|Generic1|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=WvvTNgAAALTZfyjG:20180516180517:s");
		
		driver.manage().window().maximize();
		//if element found within the wait range, run immediately (if element found in 2 sec dont wait for 18 more sec)
		//else Wait explicitly for 20 sec.
		WebDriverWait wait = new WebDriverWait(driver, 20);
		

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchBtn")));
		driver.findElement(By.id("searchBtn")).click(); // <-- found, runs without error
		
		
		//driver.findElement(By.id("searchBtnn")); <-- not found , wait for 20 sec and then give error
	}

}