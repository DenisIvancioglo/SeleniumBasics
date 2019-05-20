package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsWebsiteHw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
driver.manage().window().fullscreen();
driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Denis");
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ivancioglo");
String s="Male";
List<WebElement>sex=driver.findElements(By.name("sex"));
for(WebElement click:sex) {
	if(click.isEnabled()) {
		System.out.println(click.getAttribute("value"));
		if(click.getAttribute("value").equals(s)) {
			click.click();
		}
	}
}
List<WebElement>exp=driver.findElements(By.name("exp"));
Iterator<WebElement>it=exp.iterator();
while(it.hasNext()) {
	WebElement iter=it.next();
	if(iter.isEnabled()) {
		iter.click();
		System.out.println(iter.getAttribute("value"));
	}
}
driver.findElement(By.cssSelector("input#datepicker")).sendKeys("05/19/2019");
List<WebElement>pro=driver.findElements(By.name("profession"));
for(WebElement prof:pro) {
	if(prof.isEnabled()) {
		prof.click();
		System.out.println(prof.getAttribute("value"));
		
	}
}

String sel="Selenium Webdriver";
List<WebElement>app=driver.findElements(By.name("tool"));
Iterator<WebElement>iterat=app.iterator();
while(iterat.hasNext()) {
	WebElement has=iterat.next();
	String value=has.getAttribute("value");
	if(has.isEnabled()) {
		
		System.out.println(value);
		if( value.equals(sel)) {
			has.click();
		}
	}
}
Thread.sleep(3000);
driver.quit(); 

	}

}
