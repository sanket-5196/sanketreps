package browseroperations;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Keyboardoperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
		//using Escape of keyboard to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		WebDriver driver1=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		//login in actitime application using Enter key
		driver1.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver1.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		WebDriver driver2=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		//identify first name input field
		WebElement firstName=driver2.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in first name field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//in last name field use ctrl+v
		driver2.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		WebDriver driver3 = s1.setUp("chrome", "https://www.flipkart.com/");

		// using Escape of keyboard to avoid login popup
		WebElement element = driver3.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		
//		for (int i = 0; i < 10; i++) {
//			element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1500);
//		}
	
		Thread.sleep(1500);
		//directly goto bottom of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1500);
		//directly goto Top of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		WebDriver driver4=s1.setUp("chrome", "https://www.flipkart.com/");
		
		try {
			WebElement element1 = driver.findElement(By.xpath("//body"));
			element1.sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e) {
			
		}
		Thread.sleep(1500);
		driver4.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
	}

	}


