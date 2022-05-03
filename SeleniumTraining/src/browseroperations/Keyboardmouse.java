package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utilities.SeleniumUtility;

public class Keyboardmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("xyz"));

	}

}
