package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
	      
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://odnoklassniki.ru");
//	      driver.close();
	      driver.quit();
	}

}
