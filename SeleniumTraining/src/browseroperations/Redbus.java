package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")
				
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
	    driver.findElement(By.id("src")).sendKeys("Wakad, pune");
	    driver.findElement(By.id("dest")).sendKeys("Mapusa, Goa");
	    driver.findElement(By.id("onward_cal")).click();
	    driver.findElement(By.cssSelector(".next")).click();
	    driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>*:nth-child(4)>.wd.day:nth-of-type(3)")).click();;
	    driver.findElement(By.cssSelector(".selected")).click();
        driver.findElement(By.cssSelector("#search_btn")).click();
        driver.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)")).click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
       
        
	}

}
