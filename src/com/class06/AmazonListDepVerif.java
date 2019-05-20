package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonListDepVerif {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");

WebDriver driver=new ChromeDriver();
driver.manage().window().fullscreen();
driver.get("http://amazon.com/");
WebElement drp=driver.findElement(By.cssSelector("select[class='nav-search-dropdown searchSelect']"));

Select sel=new Select(drp);
List<WebElement>list=sel.getOptions();
System.out.println(list.size());
for(int i=0; i<=list.size()-1; i++) {
	String text=list.get(i).getText();
	System.out.println(text);
}
sel.selectByVisibleText("Computers");
Thread.sleep(3000);
driver.quit();
	}

}
