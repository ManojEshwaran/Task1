package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//1.Question 1
/*		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click(); 
		
		//2.Question
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("arunmano");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("123456");		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click(); */
		
		//3.Question
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
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
			
		WebElement hobbies = driver.findElement(By.id("checkbox1"));
		hobbies.click();
		WebElement hobbies2 = driver.findElement(By.id("checkbox2"));
		hobbies2.click();
		
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();
		WebElement language1 = driver.findElement(By.xpath("//a[@class='ui-corner-all']"));
		language1.click();
		
		WebElement outer = driver.findElement(By.xpath("//div[@class='row']"));
		outer.click();
		
		
		
		
		
		WebElement pass1 = driver.findElement(By.id("firstpassword"));
		pass1.sendKeys("arun@123");
		
		WebElement pass2 = driver.findElement(By.id("secondpassword"));
		pass2.sendKeys("arun@123");
		
	}

}
