package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive=new ChromeDriver();
		
		webdrive.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement username=webdrive.findElement(By.cssSelector("input[placeholder='Username']"));
		 username.sendKeys("sanket5196");
		 webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
		 
		webdrive.switchTo().activeElement().sendKeys("Sanket",Keys.TAB);
		
		webdrive.switchTo().activeElement().sendKeys("gaykwad",Keys.TAB);
		
		webdrive.switchTo().activeElement().sendKeys("sanketg5196@gmail.com",Keys.TAB);
		webdrive.switchTo().activeElement().click();
		webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		webdrive.switchTo().activeElement().click();
		
	
	   //List<WebElement> country = webdrive.findElements(By.cssSelector("select#input-country"));
	   //WebElement coutry=country.get(3);
	   //Actions act =new Actions(webdrive);
	   //act.moveToElement(coutry).click().build().perform();
	   
		webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
		webdrive.switchTo().activeElement().sendKeys("sanket",Keys.TAB);
		webdrive.switchTo().activeElement().click();
		webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
		webdrive.switchTo().activeElement().click();
	}

}



