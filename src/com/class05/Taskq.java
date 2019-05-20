package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> box=driver.findElements(By.name("exp"));
		for(WebElement radio:box) {
			if(radio.isEnabled()) {
				radio.click();
				System.out.println(radio.getAttribute("value"));
			}
		}
		String wd="Selenium Webdriver";
		List<WebElement> b=driver.findElements(By.name("tool"));
		for(WebElement check:b) {
			if(check.isEnabled()) {
				
				System.out.println(check.getAttribute("value"));
			if(check.getAttribute("value").equals(wd)) {
				check.click();
			}
		}
	}}

}
