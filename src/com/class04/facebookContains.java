package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/denisivancioglo/Selenium/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("8502408557");
		driver.findElement(By.xpath("//input[contains(@ type,'pass')]")).sendKeys("alishka14");
		driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();

	}

}
