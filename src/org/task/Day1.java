package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver ();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver1.get("http://www.greenstechnologys.com/");
		driver1.get("http://gmail.com/");
		driver1.get("http://www.flipkart.com/");
		driver1.get("http://greenstech.in/selenium-course-content.html");
	
	}

}
