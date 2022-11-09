package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTask\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions(driver);
		
		//Question 1
	// Debit	
/*		WebElement srcAcc = driver.findElement(By.id("credit2"));		
		WebElement tarAcc = driver.findElement(By.id("bank"));
	//	a.dragAndDrop(srcAcc, tarAcc).perform();
		a.clickAndHold(srcAcc).release(tarAcc).perform();
		
		
		WebElement srcAmt = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement tarAmt = driver.findElement(By.id("amt7"));
	//	a.dragAndDrop(srcAmt, tarAmt).perform();
		a.clickAndHold(srcAmt).release(tarAmt).perform();
		
	// credit	
		WebElement srcSales = driver.findElement(By.id("credit1"));
		WebElement tarSales = driver.findElement(By.id("loan"));
		a.clickAndHold(srcSales).release(tarSales).perform();
		
		
		WebElement salesAmnt = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement saleTar = driver.findElement(By.id("amt8"));
		a.clickAndHold(salesAmnt).release(saleTar).perform(); 
		
		//Question 2
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		a.moveToElement(prime).perform();
		WebElement free = driver.findElement(By.xpath("//div[@class='nav-coreFlyout nav-flyout'][1]"));
		a.click(free).perform(); 
		
		//Question 3
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement home = driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
		a.click(home).perform();
		WebElement flip = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		a.moveToElement(flip).perform();
		WebElement bath = driver.findElement(By.xpath("//a[@title='Bath Towels'][1]"));
		a.click(bath).perform();
		WebElement printTowel = driver.findElement(By.xpath("//a[@class='s1Q9rs'][1]"));
		String text = printTowel.getText();
		System.out.println(text); 
		
	/*	//Question 5
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement sports = driver.findElement(By.id("nav_45"));
		a.moveToElement(sports).perform();
		WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.click(weight).perform(); 
		
		//Question 6
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(courses).perform();
		WebElement st = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(st).perform();
		WebElement sel = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		a.click(sel).perform(); 
		
		//Question 7
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement courses1 = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(courses1).perform();
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracle).perform();
		WebElement oracleSQL = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
		a.click(oracleSQL).perform(); 
		
		//Question 8 (DataWarhouse not present)
		
		
		//Question 9
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement courses3 = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(courses3).perform();
		WebElement rpa = driver.findElement(By.xpath("//div[@title='RPA']"));
		a.moveToElement(rpa).perform();
		WebElement blue = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		a.click(blue).perform(); 
		
		//Question 10
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement courses2 = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(courses2).perform();
		WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(data).perform(); 
		
		//Question 11
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.xpath("//li[@class='ShoppingLinks__item'][1]"));
		a.moveToElement(all).perform();
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heat).perform();
		WebElement air = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		a.moveToElement(air).perform();
		WebElement port = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		a.click(port).perform();
		
    	//Question 12
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement all1 = driver.findElement(By.xpath("//li[@class='ShoppingLinks__item'][1]"));
		a.moveToElement(all1).perform();
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement interiorPaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interiorPaint).perform();
		WebElement ceilingPaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.click(ceilingPaint).perform(); 
		
		//Question 13
		driver.get("https://www.snapdeal.com/"); 
		
		//Question 14
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//li[@navindex='2']"));
		a.moveToElement(women).perform();
		WebElement heels = driver.findElement(By.xpath("//span[text()='Heels']"));
		a.click(heels).perform(); */
		
		//Question 15
		driver.get("https://www.amazon.in/");
		
	}
}
