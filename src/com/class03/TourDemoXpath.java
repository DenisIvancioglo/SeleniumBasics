package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TourDemoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

WebDriver driver=new ChromeDriver();

driver.get("http://newtours.demoaut.com/");

driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.xpath("//input[@ name='firstName']")).sendKeys("Denis");
driver.findElement(By.xpath("//input[@ name='lastName']")).sendKeys("Ivancioglo");
driver.findElement(By.xpath("//input[@ name='phone']")).sendKeys("85-23422");
driver.findElement(By.xpath("//input[@ name='userName']")).sendKeys("denis.@gmail.com");
driver.findElement(By.xpath("//input[@ name='address1']")).sendKeys("1547 methyl street");
driver.findElement(By.xpath("//input[@ name='city']")).sendKeys("Fairfax");
driver.findElement(By.xpath("//input[@ name='postalCode']")).sendKeys("15216");

Select drp=new Select(driver.findElement(By.xpath("//select[@ name='country']")));
drp.selectByVisibleText("MOLDOVA");
driver.findElement(By.xpath("//input[@ name='email']")).sendKeys("magadi777");
driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("dencik1234");
driver.findElement(By.xpath("//input[@ name='confirmPassword']")).sendKeys("dencik1234");
driver.findElement(By.xpath("//input[@ name='register']")).click();

	}

}
