package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaGuruCourseList {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> elect = driver.findElements(By.tagName("h4"));
		for (WebElement x : elect) {
			System.out.println(x.getText());
			if (x.getText().equals("MUST LEARN!")) {
				break;
			}
			
		}
	}

}
