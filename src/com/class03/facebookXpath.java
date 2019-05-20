package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/denisivancioglo/Selenium/chromedriver");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@ type='email']")).sendKeys("8502408557");
driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("alishka14");
driver.findElement(By.xpath("//input[@ value='Log In']")).click();

	
	}

}
