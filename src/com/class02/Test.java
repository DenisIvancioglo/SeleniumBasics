package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
    
    WebDriver driver = new ChromeDriver();
    driver.get("http://amazon.com");
    System.out.println(driver.getTitle());
    String title=driver.getTitle();
    if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
    	System.out.println("this is right title");
    }
    else {
    	System.out.println("not right");
    }
}
}
