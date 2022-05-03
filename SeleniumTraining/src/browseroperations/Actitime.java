package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String sourceCode= driver.getPageSource();
		System.out.println("application source code"+ sourceCode);
		System.out.println("sourcecode length"+ sourceCode.length());
		System.out.println("application url"+ driver.getCurrentUrl());
		System.out.println("application title"+ driver.getTitle());
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("actitime login page opened successfully...");
		}else {
			System.out.println("Either actitime login page not opened or its title got changed");
		}
		driver.close();
	}

}
