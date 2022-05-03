package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Total identified elements:" + allOptions.size());
           for(int i=0;i<allOptions.size();i++) {
			
			WebElement option=allOptions.get(i);
			String name=option.getText();
			System.out.println("Option Name: "+name);
		
	}

}
}