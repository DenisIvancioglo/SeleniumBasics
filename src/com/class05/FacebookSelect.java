package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/denisivancioglo/Selenium/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().fullscreen();
Select sel= new Select(driver.findElement(By.cssSelector("select#month")));
sel.selectByVisibleText("Jul");
List<WebElement>lis=sel.getOptions();
System.out.println(lis.size()-1);
Select day=new Select(driver.findElement(By.cssSelector("select#day")));
day.selectByVisibleText("9");
List<WebElement>daylis=day.getOptions();
System.out.println(daylis.size()-1);


Select year=new Select(driver.findElement(By.cssSelector("select#year")));
year.selectByVisibleText("1996");
List<WebElement>yearList=year.getOptions();
System.out.println(yearList.size()-1);

driver.close();
	}

}
