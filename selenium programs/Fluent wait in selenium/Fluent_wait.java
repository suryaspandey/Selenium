package com.selenium.programs;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_wait {
public WebDriver driver;
	
	public Fluent_wait() {
		
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();

	}
	
	public void fluentwait(By by) {
		
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
				// check for element(searchBtn) in every 2 sec till 20 sec
		
		.withTimeout(Duration.ofSeconds(20))
		
		.pollingEvery(Duration.ofSeconds(2))
		
		// show all exceptions except for (ignoring) the following exceptions
		.ignoring(NoSuchElementException.class)
		.ignoring(ElementNotVisibleException.class)
		.ignoring(StaleElementReferenceException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
			
		});
		
		
	}

	@Test
	public void fluent_wait() {
		
		driver.get("https://www.makemytrip.com/daily-deals/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Sitelink|Generic1|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=WvvTNgAAALTZfyjG:20180516180517:s");
		driver.manage().window().maximize();
		fluentwait(By.id("searchBtn"));
		driver.findElement(By.id("searchBtn")).click();
		
		// driver.findElement(By.id("searchBtnn")).click(); <-- Error: no such element: Unable to locate element: {"method":"id","selector":"searchBtnn"}
	}


}


