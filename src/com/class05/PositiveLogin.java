package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement login=driver.findElement(By.cssSelector("input#user-name"));
		login.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		WebElement prod=driver.findElement(By.cssSelector("div.product_label"));
		boolean isDisplayed=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if(isDisplayed) {
			System.out.println("Label is displayed");
		}
		String pr=prod.getText();
		if(pr.contains("Products")) {
			System.out.println("verified");
		}else {
			
		}
		driver.navigate().back();
	}

}
