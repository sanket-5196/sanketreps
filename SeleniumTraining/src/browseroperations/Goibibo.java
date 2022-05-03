package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.cssSelector(".happy-nav>li:nth-of-type(5)")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Goa");
		driver.findElement(By.cssSelector("#downshift-1-menu>div:nth-child(1)")).click();

	}

}
