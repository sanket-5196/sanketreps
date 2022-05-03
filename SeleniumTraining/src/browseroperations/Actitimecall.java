package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.get("https://demo.actitime.com/login.do");
		
		String expected ="actiTIME - Login";
		
		String actual= driver.getTitle();
		
		
		if(expected.equals(actual)) {
			System.out.println("you are on correct page");
		}else {
			System.out.println("Title is not as expected");
		}
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");;
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.cssSelector(".withSubMenu>table>tbody>:first-child>:nth-child(4)>a")).click();
		
		driver.findElement(By.cssSelector(".customersProjectsPanel>:first-child .ellipsis")).click();
		
		driver.findElement(By.cssSelector("div.createNewTasks")).click();
		
		WebElement CustDropdn = driver.findElement(By.cssSelector(".customerSelector .dropdownButton"));
			
		CustDropdn.click();
		
		List <WebElement> custName = driver.findElements(By.cssSelector(".customerSelector .searchItemList>div"));
		
		if(custName.size()>=4) {
			driver.findElement(By.cssSelector(".customerSelector .searchItemList>:nth-child(4)")).click();
			
			driver.findElement(By.cssSelector(".projectSelector .dropdownButton")).click();
			
			List <WebElement> custProject= driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
			
			if(custProject.size()>=5) {
				driver.findElement(By.cssSelector(".projectSelector .searchItemList>:nth-child(5)")).click();
			}else {
				driver.findElement(By.cssSelector(".projectSelector .searchItemList>:first-child")).click();
				
				driver.findElement(By.cssSelector(".selectCustomerAndProject tbody>:nth-child(4)>:first-child>input")).sendKeys("Api Testing");
			}
		}else {
			driver.findElement(By.cssSelector(".customerSelector .searchItemList>:first-child")).click();
			
			driver.findElement(By.cssSelector("div.newCustomer tbody>:nth-child(2)>td>input")).sendKeys("Acceleration");
			
			driver.findElement(By.cssSelector(".newCustomer.newProject tbody>:nth-child(4)>:first-child>input")).sendKeys("Testing123");
		}
		
		driver.findElement(By.cssSelector(".taskTableContainer>table>:nth-child(3)>:first-child input[placeholder='Enter task name']")).sendKeys("Testing");
		
		driver.findElement(By.cssSelector(".createTasksTable>tbody>:first-child>:nth-child(4) button")).click();
		
		driver.findElement(By.cssSelector(".x-menu-list li>div>table>tbody>:first-child>:nth-child(3)>a")).click();
		
		driver.findElement(By.cssSelector(".x-date-inner tbody>:nth-child(3)>:nth-child(3)>a>em>span")).click();
		
		driver.findElement(By.cssSelector(".basicLightboxFooter>:nth-child(2) .components_button_label")).click();
		}  

	}


