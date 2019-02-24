package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaYahoo {
	 public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium",Keys.ENTER);
		gotopage("3");
	}
	
public static void gotopage(String pageNum) {
		
		List<WebElement> yaPages = driver.findElements(By.xpath("//div[@class='compPagination']//a"));
		for (int i = 0; i < yaPages.size(); i++) {
			if(yaPages.get(i).getText().equals(pageNum))
			{
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				yaPages.get(i).findElement(By.tagName("a")).click();
				break;
			}
			
		}
		driver.quit();

}}
