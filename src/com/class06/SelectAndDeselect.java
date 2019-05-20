package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
//	Verify how many options available in the first drop down and then select “United states of America”
//	Verify how many options available in the second drop down and then select all.
//	Deselect China from the second drop down
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		WebElement count=driver.findElement(By.cssSelector("select#countriesSingle"));
		Select select=new Select(count);
		List<WebElement>lis=select.getOptions();
		System.out.println(lis.size());
		select.selectByVisibleText("United states of America");
		WebElement country=driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select2=new Select(country);
		List<WebElement>list=select.getOptions();
		System.out.println(list.size());
		
		if(select2.isMultiple()) {
			for(int i=0; i<list.size();i++ ) {
				select2.selectByIndex(i);
			}
		}
		select2.deselectByVisibleText("China");
		

	}

}
