package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		Iterator<WebElement>it=links.iterator();
		int a=0;
		while(it.hasNext()) {
			String web=it.next().getText(); 
		
			if(!(web.isEmpty())) {
				System.out.println(web);
				a++;
				
		}
			
		}
		System.out.println(a);
	}

}
