package org.task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("http://www.greenstechnologys.com/");
					
		WebElement print = driver.findElement(By.xpath("//u[contains(text(),'Greens')]"));
		String text = print.getText();
		System.out.println(text); */
		
	//	driver.get("http://greenstech.in/selenium-course-content.html");
		
	/*	WebElement id = driver.findElement(By.xpath("//a[@role='tab']"));
		id.click();
		
		WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'400+ batches')]"));
		String text2 = paragraph.getText();
		System.out.println(text2); 
		
		//Question 3
		WebElement address = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][1]"));
		String text3 = address.getText();
		System.out.println(text3);
		
		//Question 4
		WebElement omr = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][2]"));
		String text4 = omr.getText();
		System.out.println(text4); 
		
		//Question 5
		WebElement overView = driver.findElement(By.id("overview-tab"));
		overView.click();
		
		WebElement para = driver.findElement(By.xpath("//div[@class='card-body'][1]"));
		String text5 = para.getText();
		System.out.println(text5); 
		
		//Question 6
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("manoj");
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2); 

        //Question 7
		driver.get("http://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("greens velmurugan");
		WebElement search = driver.findElement(By.xpath("//input[@value='Google Search'][1]"));
	    WebElement link1 = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]"));
	    link1.click(); 
		
/*		//Question 8
		driver.get("http://adactinhotelapp.com/\r\n");
		WebElement user1 = driver.findElement(By.name("username"));
		user1.sendKeys("manoj");
	    String attribute = user1.getAttribute("value");
	    System.out.println(attribute);
	    
	    WebElement pass1 = driver.findElement(By.id("password"));
	    pass1.sendKeys("123456");
	    String attribute2 = pass1.getAttribute("value");
	    System.out.println(attribute2); 
		
		//Question 9
		driver.get("https://www.snapdeal.com/");
		WebElement srch = driver.findElement(By.id("inputValEnter"));
		srch.sendKeys("Iphone");
		WebElement click = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		click.click();
		WebElement apple = driver.findElement(By.xpath("//img[@class='product-image '][1]"));
		apple.click(); 
		
		//Question 10
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement flip = driver.findElement(By.xpath("//input[@type='text']"));
		flip.sendKeys("smart watch");
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		WebElement click1 = driver.findElement(By.xpath("//div[@class='_2kHMtA'][1]"));
		click1.click(); */
		
		//Question 11
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//div[@class='_28p97w'][1]"));
		WebElement uname = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		uname.sendKeys("manoj");
		String attribute = uname.getAttribute("value");
		System.out.println(attribute);
		
		WebElement upass = driver.findElement(By.xpath("//input[@type='password']"));
		upass.sendKeys("12345");
		String attribute2 = upass.getAttribute("value");
		System.out.println(attribute2);
		
/*		//Question 12
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement shop = driver.findElement(By.xpath("//input[@onfocus='autoComplete()']"));
		shop.sendKeys("mens shirts");
		WebElement shirts = driver.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
		shirts.click();
		WebElement first = driver.findElement(By.xpath("//div[@class='column col3 search_blocks'][1]"));
		first.click(); */
	}
	
}
