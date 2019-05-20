package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newToursScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Denis");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("Ivancioglo");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("85021312");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("denis.fafa@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("15 47 methyl street");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("Pittsburgh");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("Pa");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("15216");
		Thread.sleep(3000);
		Select drp=new Select(driver.findElement(By.name("country")));
		drp.selectByVisibleText("MOLDOVA");
		driver.findElement(By.name("email")).sendKeys("magadi777");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("dencik1996");
		Thread.sleep(3000);
		driver.findElement(By.name("confirmPassword")).sendKeys("dencik1996");
		Thread.sleep(3000);
		driver.findElement(By.name("register")).click();
		driver.close();

	}

}
