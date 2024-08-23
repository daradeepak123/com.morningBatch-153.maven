package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtils.SeleniumHelper;

public class LoginPage extends SeleniumHelper{
	
	
	String unameTB="//input[@name='username']";
	String pwdTB="//input[@name='password']";
	String lgnButton="//button";
	
	
	public void uNameTB(WebDriver driver,String userName)
	{
		sendDataTB(driver, unameTB, userName);
	}
	
	public void passWordTB(WebDriver driver,String password)
	{
		sendDataTB(driver, pwdTB, password);
	}
	
	public void lgnButton(WebDriver driver)
	{
		driver.findElement(By.xpath(lgnButton)).click();
	}
	
	
	public void performLogin(WebDriver driver,String uname,String pwd)
	{
		uNameTB(driver,uname);
		passWordTB(driver,pwd);
		lgnButton(driver);
		
	}
	

}
