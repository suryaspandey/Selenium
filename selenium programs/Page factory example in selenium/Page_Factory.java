package com.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Page_Factory {
	
	
	@FindBy(xpath = "//a[@href= 'javascript:void(0)' and text() = 'Login']")  private WebElement Login_BTN; //
	
	public WebDriver driver;
	
	public Page_Factory() {
			
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();

	
	PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public void pageFacEx() throws InterruptedException {
		driver.get("https://www.grabon.in/swiggy-coupons/?go=cpn_19740");
		Login_BTN.click();
		
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void quit(){
		
		driver.quit();
	}

}
