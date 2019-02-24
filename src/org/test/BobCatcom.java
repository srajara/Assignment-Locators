package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BobCatcom {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en/index");
		driver.findElement(By.xpath("(//a[@class='close'])[2]")).click();
	driver.findElement(By.xpath("(//a[@class='text-uppercase text-center has-sub dtm-pro-grp-txt-name'])[3]")).click();
	driver.findElement(By.xpath("(//div//a[@class='close'])[3]")).click();
	WebElement wb = driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//h1"));
	System.out.println(wb.getText());
//	List<WebElement> we = driver.findElements(By.xpath("//div//h2"));
//		for (int i = 0; i < we.size(); i++) {
//			System.out.println(we.get(i).getText());
//			
//		}
	}

}
