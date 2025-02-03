package Week2.Day3.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		//driver.findElement(By.className("selected")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("571");
		driver.findElement(By.name("phoneNumber")).sendKeys("5712266227");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Lead ID']/following::a[@class='linktext'][1]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("id")).sendKeys("11032");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.close();
		

	
		
		
	}

}
