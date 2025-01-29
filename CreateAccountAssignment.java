package Week2.Day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment
{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//Input[@id='accountName']")).sendKeys("TL Account6");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement sourceDropdown1 =	driver.findElement(By.name("industryEnumId"));
		Select dd1=new Select(sourceDropdown1);
		dd1.selectByIndex(3);
		
		WebElement ownerDropdown =	driver.findElement(By.name("ownershipEnumId"));
		Select dd2=new Select(ownerDropdown);
		dd2.selectByVisibleText("S-Corporation");
		
		WebElement sourceDropdown =	driver.findElement(By.name("dataSourceId"));
		Select dd3=new Select(sourceDropdown);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaignDropdown =	driver.findElement(By.name("marketingCampaignId"));
		Select dd4=new Select(campaignDropdown);
		dd4.selectByIndex(6);
		
		WebElement stateDropdown =	driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5=new Select(stateDropdown);
		dd5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	
	}

}
