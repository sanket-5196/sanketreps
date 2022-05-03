package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actime.com/login.do");
		
		WebElement usernameinputfield=driver.findElement(By.id("username"));
		usernameinputfield.sendKeys("admin");
		
		WebElement passwordinputfield=driver.findElement(By.name("pwd"));
		passwordinputfield.sendKeys("admin");
		
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		loginbutton.click();
		
		
		
		
		
		
	}

}
