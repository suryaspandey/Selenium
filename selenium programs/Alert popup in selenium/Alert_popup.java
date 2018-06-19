package com.selenium.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_popup {
public WebDriver driver;
	
	public Alert_popup() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
@Test
	
	
	public void alert_popup() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.id("iframeResult"));
		
		
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//body/button[@type = 'button']")).click();
		
		Thread.sleep(5000);
		//standard command to tell selenium that there is an alert.
		Alert a = driver.switchTo().alert();
		a.accept(); // accept() always selects the yes/ ok command/option
		//a.dismiss();// performs the action of cancel 
		
		
		driver.switchTo().defaultContent(); // comes out of the frame. if it is inside the frame, it wont be able to run all the elements which are present outside the frame tag
		
		driver.findElement(By.xpath("//button[text() = 'Run »']")).click();
}

}
