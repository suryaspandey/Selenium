package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicit_Wait_Commands {
	public WebDriver driver;
	
	public Implicit_Wait_Commands() {
		
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void waitcmd() {
		driver.get("https://www.makemytrip.com/daily-deals/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Sitelink|Generic1|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=WvvTNgAAALTZfyjG:20180516180517:s");
		//if element found, don't wait else Wait implicitly for 10 sec
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("searchBtnn")); <-- not found , wait for 10 sec and then gives error
		
		driver.findElement(By.id("searchBtn")); // <-- found, runs normally
	}

}
