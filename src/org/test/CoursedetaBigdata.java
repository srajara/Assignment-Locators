package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoursedetaBigdata {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> elect = driver.findElements(By.xpath("//div[@style='height: 820px;']//ul//li//a"));
		for (int i = 0; i<elect.size(); i++) {
			if (i<9) {
			System.out.println(elect.get(i).getText());
				
			}
			
			
			
			
		}
		
			
			
		}
	}


