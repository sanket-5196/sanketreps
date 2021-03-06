package browseroperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class VtigerContacts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement menu =driver.findElement(By.id("appnavigator"));
		menu.click();
		
		WebElement marketing=driver.findElement(By.cssSelector(".app-list.row>:nth-child(2)>div>div>:nth-child(2)"));
		
		marketing.click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(marketing, 150, 0).click().build().perform();
		
		driver.findElement(By.cssSelector("button#Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("select2-chosen-2")).click();
		
		driver.findElement(By.cssSelector("#select2-results-2>:nth-child(2)>div")).click();
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Bhushan",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("Patil");
		
		driver.findElement(By.cssSelector("input[name='mobile']")).sendKeys("9547821645");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector(".col-lg-7>:nth-child(2)>a")).click();
		
		WebElement identify = driver.findElement(By.cssSelector(".col-sm-12.col-xs-12"));
		
		List<WebElement> name = driver.findElements(By.cssSelector("#listview-table tbody>tr>:nth-child(2) a"));
		
		for(int i=0; i<name.size();i++) {
			WebElement listName = name.get(i);
			
			String firstName = listName.getText();
			
			String expectName= "Bhushan";
			
			if(firstName.equals(expectName)) {
				System.out.println("New Contact created successful");
				break;
			}
		}
		
		String titleBeforeUpdate = driver.findElement(By.xpath("//tr[td[span[span[a[text()='Bhushan']]]]]/td[4]//span[@class='value']")).getText();
		
		System.out.println("Title name Before Update :"+titleBeforeUpdate);
		
		WebElement checkBox =driver.findElement(By.xpath("//tr[td[span[span[a[text()='Bhushan']]]]]/td[1]//input"));
		
		checkBox.click();
		
		driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")).click();
		
		WebElement titleEdit = driver.findElement(By.cssSelector("#Contacts_editView_fieldName_title"));
		
		titleEdit.sendKeys("Testing");
		driver.findElement(By.id("include_in_mass_edit_title")).click();
		
		driver.findElement(By.className("saveButton")).click();
		
		identify = driver.findElement(By.cssSelector(".col-sm-12.col-xs-12"));
		
		driver.findElement(By.cssSelector("p[title='All']>a")).click();
		
		//driver.findElement(By.cssSelector("a[title='Contacts']>h4")).click();
		
		String titleAfterUpdate = driver.findElement(By.xpath("//tr[td[span[span[a[text()='Bhushan']]]]]/td[4]//span[@class='value']")).getText();
		System.out.println("Title name after Update :"+titleAfterUpdate);
		
		if(titleBeforeUpdate.equals(titleAfterUpdate)) {
			System.out.println("contact not updated");
		}else {
			System.out.println("contact is updated successful");
		}
		
		driver.findElement(By.xpath("//tr[td[span[span[a[text()='Bhushan']]]]]/td[1]//input[@class='listViewEntriesCheckBox']")).click();
	
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		
		WebElement yesButton =driver.findElement(By.cssSelector("button[data-bb-handler='confirm']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(yesButton));
		
		yesButton.click();
		try {
		WebElement empty=driver.findElement(By.className("emptyRecordsContent"));
		
		String emptyList= empty.getText();
		String expectedForEmptyContactList ="No Contacts found. Create or Import Contacts";
		String expectedForEmptyContactList2 ="N??o Contatos Encontrado(a). Criar ou Importar Contatos";
		
		if((emptyList.equals(expectedForEmptyContactList)) || (emptyList.equals(expectedForEmptyContactList2)) ) {
			System.out.println("contact deleted successful");
		}else {
			System.out.println("contact is not deleted");
		}
		}catch(NoSuchElementException e) {
			System.out.println("List is not Empty so wait it will check contact is deleted or not from list of contact");
		}
		try {
			List<WebElement> lastName = driver.findElements(By.cssSelector("#listview-table tbody>tr>:nth-child(3) a"));
			for(int i=0; i<lastName.size();i++) {
				WebElement listName = lastName.get(i);
				String lastName1 = listName.getText();
				
				String expectName= "Patil";
				int cntr=0;
				if(lastName1.equals(expectName)) {
					cntr++;
				}
				if(cntr==0) {
					System.out.println("Contact is deleted Successful");
				}
				if(cntr==1){
					System.out.println("Contact is not deleted");
				}
			}
		}catch(NoSuchElementException e) {
			System.out.println("There is no contact it means list is Empty and contact is deleted verified");
		}
	}
}


