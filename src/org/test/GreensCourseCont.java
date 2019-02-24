package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCourseCont {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		List<WebElement> elec = driver.findElements(By.xpath("//div[@class='trainer-info']//li//a"));
		for (int i = 0; i < elec.size(); i++) {
			
			if (i<=9) {
				
				System.out.println(elec.get(i).getText());
				
			}
			
		}
		
	}
}
