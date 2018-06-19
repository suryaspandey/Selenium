package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Keyboard_Interaction_Prog {
	@FindBy(id="Name")
	private WebElement fIrstName_TxtBox;	
	@FindBy(id="Email")
	private WebElement eMail_TxtBox;	
	
	
	
	
	public WebDriver driver ;
	
	public Keyboard_Interaction_Prog(){
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	@Test
	public void PagefactoryExamle(){
		driver.get("http://www.deal4loans.com/apply-home-loans.php");
		fIrstName_TxtBox.sendKeys("abc");
		fIrstName_TxtBox.sendKeys(Keys.CONTROL + "a");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fIrstName_TxtBox.sendKeys(Keys.CONTROL + "x");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fIrstName_TxtBox.sendKeys(Keys.CONTROL + "v");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fIrstName_TxtBox.sendKeys("xyz");
		fIrstName_TxtBox.sendKeys(Keys.CONTROL + "z");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fIrstName_TxtBox.sendKeys(Keys.CONTROL + "y");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eMail_TxtBox.sendKeys(Keys.SHIFT + "abc");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		

	}
	
	@AfterSuite
	public void quit(){
		
		driver.quit();
	}
}