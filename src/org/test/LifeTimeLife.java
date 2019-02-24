package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifeTimeLife {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.lifetime.life/");
	//driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
	List<WebElement> elec = driver.findElements(By.xpath("(//ul[@class='list-unstyled '])[1]//li//a"));
	for (int i = 0; i < elec.size(); i++) {
		Thread.sleep(300);
		System.out.println(elec.get(i).getText());
	}
	
	List<WebElement> elec2 = driver.findElements(By.xpath("(//ul[@class='list-unstyled dropdown-columns'])[1]//li//a"));
	for (int i = 0; i < elec2.size(); i++) {
		System.out.println(elec2.get(i).getText());
		
	}
	
	driver.quit();
}
}
