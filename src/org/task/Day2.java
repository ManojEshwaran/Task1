package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Question 1
	/*	driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("arunmano");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456"); */
		
		//Question 2
	/*	driver.get("https://www.redbus.in/");
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Chennai");
		
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Kanyakumari"); 
		
		//Question 3
		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.name("q"));
		google.sendKeys("Enter GreensTechnology"); */
		
		//Question 4 XXXXX
		driver.get("https://netbanking.hdfcbank.com/");		
		WebElement customerId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		customerId.sendKeys("1234567890"); 
		
	/*	//Question 5
		driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Chennai"); 
		
		//Question 6
		driver.get("https://www.snapdeal.com/login");
		WebElement phoneNumber = driver.findElement(By.name("username"));
		phoneNumber.sendKeys("arunmano");
		//Optional
		phoneNumber.sendKeys("1234567890"); 
		
		//Question 7
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("arunmano"); 
		
		WebElement pass = driver.findElement(By.name("password")); 
		pass.sendKeys("1234567890");*/
		
/*		//Question 8
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstName = driver.findElement(By.xpath("//input[@type='text']"));
		firstName.sendKeys("Arun");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("mano");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Chennai");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("arunmano@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("1234567890");
		
		WebElement pass1 = driver.findElement(By.id("firstpassword"));
		pass1.sendKeys("arun@123");
		
		WebElement pass2 = driver.findElement(By.id("secondpassword"));
		pass2.sendKeys("arun@123");
		
		//Question 9
		driver.get("http://adactinhotelapp.com/");
		WebElement user1 = driver.findElement(By.id("username"));
		user1.sendKeys("arunmano");
		
		WebElement pass1 = driver.findElement(By.id("password"));
		pass1.sendKeys("123456"); */
	}

}
