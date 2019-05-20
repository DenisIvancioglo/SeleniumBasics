package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDomwReview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().window().fullscreen();
driver.get("https://www.toolsqa.com/automation-practice-form/");
	Thread.sleep(3000);
	WebElement country=driver.findElement(By.cssSelector("select#continents"));
	Select select=new Select(country);
	List<WebElement>allOptions=select.getOptions();
	System.out.println(allOptions.size());
	Iterator<WebElement>it=allOptions.iterator();
	while(it.hasNext()) {
		String text=it.next().getText();
		System.out.println(text);
	}
	select.selectByVisibleText("Africa");
	Thread.sleep(3000);
	select.selectByIndex(5);
	WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
	
	Select select1 = new Select(commandsDD);
	List<WebElement>allOptions1=select1.getOptions();
	for(int i=0; i<= allOptions1.size(); i++) {
		String text1=allOptions1.get(i).getText();
		System.out.println(text1);
	}
	if(select1.isMultiple()) {
		select1.selectByIndex(1);
		select1.selectByIndex(3);
	}
	Thread.sleep(5000);
	driver.quit();
	
	}

}
