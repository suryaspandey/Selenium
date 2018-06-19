package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DragDrop_Prog {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//div[@id='draggable']") private WebElement draggable_box;
	//@FindBy(id = "draggable") private WebElement draggable_box;
	
	@FindBy(xpath = "//div[@class='ui-widget-header ui-droppable']") private WebElement non_drag_box;
	
	//@FindBy(id = "droppable") private WebElement non_drag_box;
	
	public DragDrop_Prog() {
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		
	}
	@Test
	public void dragdrop() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src = '/resources/demos/droppable/default.html']"));
		
		
		driver.switchTo().frame(f1);
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(draggable_box, non_drag_box).perform();
		//builder.dr
		Thread.sleep(5000);
		//builder.moveToElement(draggable_box).perform();
		//driver.findElement(By.xpath("//p[text() = 'Drag me to my target']"));
		
		

	}

}
