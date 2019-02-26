package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fasttest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\newfilelocators\\Locators\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://fast.com/");
//	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.xpath("//div//div[@class='speed-container centered']/div/div[2]//div/div\"")).getText());
		//WebElement sPeed = driver.findElement(By.xpath("//div[@class='speed-results-container succeeded'and @id='speed-value']"));
		//System.out.println(sPeed.getText());
	}

}
