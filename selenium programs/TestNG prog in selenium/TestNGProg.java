package com.selenium.programs;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGProg {
	
	public WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
		public void beforeAllTestCases() {
			
				System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
					driver = new ChromeDriver();

	}
		
	
	@BeforeMethod(alwaysRun= true) // runs before every method
		public void BeforeEveryMethod() throws InterruptedException {
			driver.get("http://www.twitter.com");
			Thread.sleep(2000);
		}
		
	
	@AfterMethod(alwaysRun= true) // runs after every method
	public void AfterEveryMethod() throws InterruptedException {
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=1, testName= "Google", description= "testing google home pg", timeOut= 5000, enabled=true, groups= {"1", "regression","UI", "smoke"})
	public void google() throws InterruptedException {
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Reporter.log("Google page", true);
	}
	
	@Test(priority=2, testName= "Facebook", description= "testing Facebook home pg", timeOut= 5000, enabled = true ,groups= {"2","UI", "smoke"})
	public void fb() throws InterruptedException {
		
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Reporter.log("Facebook page", true);
	}
	
	@Test(priority=3, testName= "jqueryui", description= "testing jqueryui home pg", timeOut= 30000, groups= {"3", "regression","UI"})
	public void jqueryui() throws InterruptedException {
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Reporter.log("jqueryui page", true);
	}
	
	@Test(priority=4, testName= "stackoverflow", description= "testing stackoverflow home pg", timeOut= 30000, groups= {"4", "regression"}, dependsOnGroups = {"3"})
	public void stackoverflow() throws InterruptedException {
		
		driver.get("http://www.stackoverflow.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Reporter.log("Stackoverflow page", true);
	}
	
	@AfterSuite(alwaysRun= true)
	public void afterAllTestCases() {
		driver.quit();
	}
	
}

//For multiple testcases, if priority is not written then TestNG executed based on alphabetical order 1. fb 2. google 3. jqueyui 4. stackoverflow
// run as. run configuration.
// precondition. if one TC fails, other dependent TC should not run.
// TC 4 is dependent on TC3. if TC3 runs then only TC4 will run