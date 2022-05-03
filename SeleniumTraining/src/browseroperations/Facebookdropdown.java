package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("._9vtf>:nth-child(9)>a")).click();
		WebElement dob=driver.findElement(By.id("._9407"));
		
		Select selectdob=new Select(dob);
		
		System.out.println("is dropdown slecting multiple elements: " + selectdob.isMultiple());
		
System.out.println("Already selected option name: "+selectdob.getFirstSelectedOption().getText());
		
		//get option count 
		List<WebElement> options=selectdob.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		 
		//select options from dropdown
		selectdob.selectByIndex(4);
				//or
		selectdob.selectByValue("2005");
				//or
		selectdob.selectByVisibleText("May");
	}
		
		

	}


