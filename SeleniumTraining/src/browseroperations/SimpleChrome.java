package browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleChrome {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();

	}

}
