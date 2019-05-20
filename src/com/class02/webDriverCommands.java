package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
      
      WebDriver driver = new ChromeDriver();
//      driver.get("http://google.com");
//      System.out.println(driver.getTitle());
//      String title=driver.getTitle();
//      if(title.equalsIgnoreCase("goofle")) {
//    	  System.out.println("this is the right tittle");
//      }
//      else {
//    	  System.out.println("sorry this is not the title");
//      }
      driver.get("http://facebook.com");
      System.out.println(driver.getTitle());
      String title=driver.getTitle();
      if(title.equalsIgnoreCase("facebook")) {
    	  System.out.println("this is the right tittle");
      }
      else {
    	  System.out.println("sorry this is not the title");
      }
     
	}

}
