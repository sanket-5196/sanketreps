package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
    String driverPath2=".\\executables\\geckodriver.exe";
		//or
   // String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";


     //step1: set driver executable path by using System.setProperty(String key,String value)
     System.setProperty("webdriver.gecko.driver", driverPath2);
     //step2: create an instance of Firefox Browser
     WebDriver driver=new FirefoxDriver();
}
		

	}


