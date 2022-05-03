package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/sortable/");
		WebElement frame=driver.findElement(By.cssSelector(".ui-sortable>li:nth-child(1)"));
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);

	}

}
