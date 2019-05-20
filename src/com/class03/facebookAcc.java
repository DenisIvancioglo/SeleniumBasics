package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAcc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("8502408557");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("alishka14");;
//		driver.findElement(By.partialLinkText("Forgot")).click();;
//		Thread.sleep(3000);
//		driver.navigate().back();
		driver.findElement(By.name("pass")).sendKeys("alishka14");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
