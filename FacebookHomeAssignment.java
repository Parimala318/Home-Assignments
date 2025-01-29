package Week2.Day2.Assignment;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//Input[@name='firstname']")).sendKeys("Test1");
		driver.findElement(By.xpath("//Input[@name='lastname']")).sendKeys("Test2");
		driver.findElement(By.xpath("//Input[@name='reg_email__']")).sendKeys("test1@abc.com");
		driver.findElement(By.xpath("//Input[@name='reg_passwd__']")).sendKeys("Test123$$");
		
		WebElement dateDropdown =	driver.findElement(By.id("day"));
		Select dd1=new Select(dateDropdown);
		dd1.selectByVisibleText("30");

		WebElement monthDropdown =	driver.findElement(By.id("month"));
		Select dd2=new Select(monthDropdown);
		dd2.selectByVisibleText("Mar");
		
		WebElement yearDropdown =	driver.findElement(By.id("year"));
		Select dd3=new Select(yearDropdown);
		dd3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//Input[@id='sex'][1]")).click();
		
		Thread.sleep(3000);
		
	}

}
