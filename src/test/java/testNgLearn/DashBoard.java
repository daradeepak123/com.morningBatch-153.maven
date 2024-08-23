package testNgLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoard extends NewBase{
	
	@BeforeClass
	public void reachDashBoardPage()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();;
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();;
		driver.navigate().refresh();
	}
	
	@Test
	public void validateTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test
	public void validateDashboardPageContent()
	{
		String ss=driver.findElement(By.xpath("//p[text()='Time at Work']")).getText();
		Assert.assertEquals(ss, "Time at Work");
	}
	
	@Test
	public void validateSections()
	{
		List<WebElement> text=driver.findElements(By.xpath("//button[@title='Assign Leave']/../..//div[@title]"));
		
		for(WebElement e:text)
		{
			System.out.println(e.getText());
		}
	
	
	}
	
	@AfterMethod
	public void afterMethos()
	{
		System.out.println("this is after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is after class");
	}
	
	

}
