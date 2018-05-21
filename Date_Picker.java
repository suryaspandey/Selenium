package com.selenium.programs;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date_Picker {

	public WebDriver driver;
	
	public Date_Picker(){
		System.setProperty("webdriver.chrome.driver", "/home/surya/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	@Test
	public void datepicker() {
		
		driver.get("https://www.makemytrip.com/daily-deals/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Sitelink|Generic1|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=WvvTNgAAALTZfyjG:20180516180517:s");
		 driver.findElement(By.xpath("//input[@mt-id = 'returnDate']")).click();
		 List<WebElement> date =driver.findElements(By.xpath("//table//tr//td"));
		 System.out.println("Date size: "+ date.size());
		 // get the current date
		 Calendar cal = Calendar.getInstance();
		 int DayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		 String DayOfMonthStr = String.valueOf(DayOfMonth);
		 for(WebElement dates: date) {
			 
			// if dates is equal to current date , then click on the cirrent date
			 if(dates.getText().equals(DayOfMonthStr)) {
				 
				 dates.click();
				 break;
			 }
			 
		 }
		 
	}
}
// OUTPUT: departure date has the current date 