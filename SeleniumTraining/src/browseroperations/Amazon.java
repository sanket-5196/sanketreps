package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("current page title : " + driver.getTitle());
		driver.findElement(By.id("nav-hamburger-menu")).click();
		System.out.println("current page title : " + driver.getTitle());
		driver.navigate().back();
		System.out.println("current page title : " + driver.getTitle());
		

	}

}
