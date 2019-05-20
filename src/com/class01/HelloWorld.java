package com.class01;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HelloWorld {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "/Users/aarykbaev/Selenium/chromedriver");
//        
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://google.com");
//        driver.get("https://www.facebook.com");
//        driver.get("https://www.amazon.com");
        
        System.getProperty("webdriver.gecko.driver","/Users/denisivancioglo/Selenium/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        
        
    }
}