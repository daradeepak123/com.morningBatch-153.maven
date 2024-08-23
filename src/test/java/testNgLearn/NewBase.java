package testNgLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserUtils.BrowserChoice;
import genericUtils.SeleniumHelper;
import pages.LoginPage;

public class NewBase {

	public static File file;
	public static FileInputStream fis;
	public static Properties config;
	public static WebDriver driver;
	public static BrowserChoice bc=new BrowserChoice();
	public static SeleniumHelper sh=new SeleniumHelper();
	public static LoginPage lp=new LoginPage();
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		
		file=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		fis=new FileInputStream(file);
		config=new Properties();
		config.load(fis);
	}
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		String url=config.getProperty("url");
		String browser=config.getProperty("browser");
		driver=bc.browserSelection(driver, url, browser);
		lp.performLogin(driver,"Admin" ,"admin123" );
	}
	
	
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	@AfterSuite
	public void afterSuite()
	{
		
	}
	
	
}
