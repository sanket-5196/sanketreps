package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver n1=new ChromeDriver();
		
		n1.get("https://www.saucedemo.com");
		System.out.println("current page url: " + n1.getCurrentUrl());
		
		n1.findElement(By.id("user-name")).sendKeys("standard_user");
		n1.findElement(By.id("password")).sendKeys("secret_sauce");
		n1.findElement(By.id("user-name")).clear();
		n1.findElement(By.id("user-name")).sendKeys("problem_user");
		n1.findElement(By.id("login-button")).click();
		n1.findElement(By.className("shopping_cart_link")).click();
		

	}

}
