package com.selenium.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_Frames {
	public WebDriver driver;
	
	public Alerts_Frames() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
@Test
	public void alert_frames() throws InterruptedException {
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
		driver.manage().window().maximize();
		//activate frame, since selenium never recognizes any elemnt which is inside a frame
		WebElement f = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(f);
		driver.findElement(By.xpath("//a[@href = 'https://www.w3schools.com/html/']")).click();
		
}

}
