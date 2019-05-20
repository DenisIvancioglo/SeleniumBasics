package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().fullscreen();
		WebElement login=driver.findElement(By.cssSelector("input#user-name"));
		login.sendKeys("standarduser");
		WebElement pass=driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("secretsauce");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		WebElement error=driver.findElement(By.cssSelector("h3[data-test='error']"));
		String er=error.getText();
		if(er.contains("Username and password do not match any user in this service")) {
			System.out.println("error success");
		}
	}

}
