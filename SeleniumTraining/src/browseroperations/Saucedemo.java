package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement loginid=driver.findElement(By.cssSelector(".login_credentials>br:nth-of-type(1)"));
		loginid.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("user-name")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		

	}

}
