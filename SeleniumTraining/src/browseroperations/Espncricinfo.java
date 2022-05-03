package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Espncricinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		List<WebElement> allOptions=driver.findElements(By.cssSelector(".ds-popper-wrapper"));
		System.out.println("Total Identified Elements: "+allOptions.size());
		for(int i=0;i<allOptions.size();i++) {
			
			WebElement option=allOptions.get(i);
			String name=option.getText();
			System.out.println("Option Name: "+name);
		/*	if(name.equals("News")) {
				option.click();
			
			}else {
				System.out.println("Not matched.....");
			}
		}
		
		driver.navigate().back();   */
	

	}

	}
}