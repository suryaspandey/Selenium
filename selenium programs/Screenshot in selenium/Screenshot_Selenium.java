package com.selenium.programs;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot_Sel_prog {
public WebDriver Driver;
	
	public Screenshot_Sel_prog() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		Driver = new ChromeDriver();
	}
	
	@Test
	public void screenshot_prog() throws InterruptedException {
		
		Driver.get("https://commons.apache.org/");
		Driver.manage().window().maximize();
		//Thread.sleep(15000);
		
		File scrFile = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		
		String screenshot = UUID.randomUUID().toString(); // to generate random alphanumeric character
		
		try {
			FileUtils.copyFile(scrFile, new File("Home/selenium_screenshots/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// add commons-io jar files to access File. download apache commons maven
// link: https://commons.apache.org/proper/commons-io/download_io.cgi
//whenever a test case fails, it is mandatory to show to developer because most of the times, many of the bugs may be reproduce=able but some might not be. hence to show that to developer
// selenium provides us with taking a screenshot. 