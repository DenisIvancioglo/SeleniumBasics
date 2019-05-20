package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://syntaxtechs.com/");
	    Thread.sleep(1000);
	    driver.navigate().to("http://google.com/");
	    driver.navigate().back();
	    driver.navigate().refresh();
	    String title=driver.getTitle();
	    if(title.contains("Syntax")) {
	    	System.out.println("contains");
	    }
	    else {
	    	System.out.println("no");
	    }
	}

}
