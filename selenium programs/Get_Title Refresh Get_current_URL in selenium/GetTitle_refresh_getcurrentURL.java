package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitle_refresh_getcurrentURL {
	public WebDriver driver;
	
	public GetTitle_refresh_getcurrentURL() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void firefoxProgram()  throws InterruptedException{
	driver.get("https://www.seleniumhq.org/projects/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println("Title then:"+ title);
	
	
	String url =  driver.getCurrentUrl();
	System.out.println("URL then:"+ url);
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Download")).click();
	
	
	String a_title = driver.getTitle();
	System.out.println("Title now :"+ a_title);
	Thread.sleep(4000);
	
	String a_url =  driver.getCurrentUrl();
	System.out.println("URL now :"+ a_url);
	
	driver.navigate().back();
	Thread.sleep(4000);
	System.out.println("navigate back");
	
	driver.navigate().forward();
	Thread.sleep(4000);
	System.out.println("navigate forward");
	
	driver.navigate().refresh();
	Thread.sleep(4000);
	System.out.println("refresh");
	
	}
}
