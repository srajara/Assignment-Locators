package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLoc {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("datepicker1")).click();
		gotopage("27");
	}
public static void gotopage(String pageNum) {
		
	 List<WebElement> yaPages = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (int i = 0; i < yaPages.size(); i++) {
			if(yaPages.get(i).getText().equals(pageNum))
			{
				yaPages.get(i).findElement(By.tagName("a")).click();
				break;
			} }
		driver.quit();
		}}