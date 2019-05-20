package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert aler=driver.switchTo().alert();
		System.out.println(aler.getText());
		aler.accept();
		
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert ale=driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();
	
	}

}
