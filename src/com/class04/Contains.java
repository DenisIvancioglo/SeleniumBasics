package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("standard_user");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
Thread.sleep(2000);
driver.close();
	}

}
