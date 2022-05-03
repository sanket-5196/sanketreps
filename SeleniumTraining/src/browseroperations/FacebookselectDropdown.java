package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookselectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		String expectedTitle="Facebook – log in or sign up";
		
		if(expectedTitle.equals(driver.getTitle())) {
			System.out.println("Validation completed- You are on RIGHT page");
		}else {
			System.out.println("Validation completed- You are on WRONG page");
		}
		
		driver.findElement(By.cssSelector("._9vtf>:nth-child(9)>a")).click();
		
		WebElement dayField = driver.findElement(By.id("day"));
		
		Select day = new Select(dayField);
		
		System.out.println("The dropdown of Day field is Visible :"+dayField.isDisplayed());
		
		System.out.println("The dropdown of Day field is Enable : "+dayField.isEnabled());
		
		System.out.println("The dropdown of Day field is Multiselect :"+day.isMultiple());
		
		List<WebElement> dayOptions= day.getOptions();
		
		System.out.println("Total options in Day field :"+dayOptions.size());
		
		for (int i=0; i<dayOptions.size();i++) {
			
			System.out.println("option :"+dayOptions.get(i).getText());
		}
		
		System.out.println("Default selected Day field option :"+day.getFirstSelectedOption().getText());
		
		day.selectByValue("29");
		
		System.out.println("Manually selected Day field option :"+day.getFirstSelectedOption().getText());
		
		WebElement monthField = driver.findElement(By.id("month"));
		
		System.out.println("****MONTH*****");
		//MONTH
		Select month = new Select(monthField);
		
		System.out.println("The dropdown of Month field is Visible :"+monthField.isDisplayed());
		
		System.out.println("The dropdown of Month field is Enable : "+monthField.isEnabled());
		
		System.out.println("The dropdown of Month field is Multiselect :"+month.isMultiple());
		
		List <WebElement> monthOption = month.getOptions();
		
		System.out.println("Total options in Month field :"+monthOption.size());
		
		for (int i=0; i<monthOption.size();i++) {
			System.out.println("Year option :"+monthOption.get(i).getText());
		}
		
		System.out.println("Default selected Year field option :"+month.getFirstSelectedOption().getText());
		
		month.selectByValue("12");
		
		System.out.println("Default selected Year field option :"+month.getFirstSelectedOption().getText());
		
		System.out.println("****YEAR*****");
		//YEAR
		WebElement yearField = driver.findElement(By.id("year"));
		
		Select year =new Select(yearField);
		
		System.out.println("The dropdown of Year field is Visible :"+yearField.isDisplayed());
		
		System.out.println("The dropdown of Year field is Enable : "+yearField.isEnabled());
		
		System.out.println("The dropdown of Year field is Multiselect :"+year.isMultiple());
		
		List <WebElement> yearOption = year.getOptions();
		
		System.out.println("Total options in Year field :"+yearOption.size());
		
		for (int i=0;i<yearOption.size();i++) {
			System.out.println("option "+yearOption.get(i).getText());
		}
		
		System.out.println("Default selected Year field option :"+year.getFirstSelectedOption().getText());
		
		year.selectByValue("1997");
		
		System.out.println("Manually selected Year field option :"+year.getFirstSelectedOption().getText());
		
	}


	}


