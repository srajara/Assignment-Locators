package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagingLifeTime {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");
	}
}
