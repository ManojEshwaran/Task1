package org.task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement flip = driver.findElement(By.xpath("//input[@type='text']"));
		flip.sendKeys("oneplus");
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		String xpathName = "//div[@class='_4ddWXP']";
		List<WebElement> findElements = driver.findElements(By.xpath(xpathName));
		for (int i=1;i<findElements.size();i++) {
			String xpathProductName = "//div[@class='_4ddWXP']";
			WebElement file = driver.findElement(By.xpath(xpathProductName));
			System.out.println(file.getText().toString());
		}
		
		
}
}
