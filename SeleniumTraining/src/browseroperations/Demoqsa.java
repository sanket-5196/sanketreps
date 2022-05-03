package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Demoqsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Firefox", "https://demoqa.com/alerts");
		driver.findElement(By.id("javascriptAlertsWrapper"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("promtButton")).click();;
		driver.switchTo().alert().sendKeys("sanket");

	}

}
