package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String sourceCode=driver.getPageSource();
		System.out.println("application source code : " + sourceCode);
		System.out.println("source code length : "+ sourceCode.length());
		System.out.println("application url : "+ driver.getCurrentUrl());
		System.out.println("application title : " + driver.getTitle());
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("facebook login page opened successfully...");
		}else {
			System.out.println("Either facebook login page not opened or its title got changed");
		}
	    driver.close();
	}

}
