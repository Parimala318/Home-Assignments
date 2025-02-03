package Week2.Day3.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment 
{

	public static void main(String[] args) throws InterruptedException
{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("test2");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@abc.com");
		
		WebElement stateDropdown =	driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5=new Select(stateDropdown);
		dd5.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Test Leaf Notes");
		
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		



}

}
