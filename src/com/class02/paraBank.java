package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
	      
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
	      driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Denis");
	      Thread.sleep(1000);
	      
	      driver.findElement(By.name("customer.lastName")).sendKeys("Ivancioglo");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.address.street")).sendKeys("1547 methyl street");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.address.city")).sendKeys("Pittsburgh");
	      Thread.sleep(1000);      
	      driver.findElement(By.id("customer.address.state")).sendKeys("Pa");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.address.zipCode")).sendKeys("15216");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.phoneNumber")).sendKeys("850214141");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.ssn")).sendKeys("32423532");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.username")).sendKeys("magadi77");
	      Thread.sleep(1000);
	      driver.findElement(By.id("customer.password")).sendKeys("gasdas678");
	      Thread.sleep(1000);
	      driver.findElement(By.id("repeatedPassword")).sendKeys("gasdas678");
	      Thread.sleep(1000);
	      driver.findElement(By.className("button")).click();
	}

}
