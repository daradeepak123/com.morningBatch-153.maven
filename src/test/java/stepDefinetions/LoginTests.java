package stepDefinetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTests {
	public static	WebDriver driver;

@Given("User want to Open chrome browser")
public void user_want_to_open_chrome_browser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

@Given("User wanted to login into application")
public void user_wanted_to_login_into_application() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}

@Then("User Validates title of application")
public void user_validates_title_of_application() {
	System.out.println(driver.getTitle());
}

@Then("User will navigate to Admin page")
public void user_will_navigate_to_admin_page() {
	System.out.println("we will navigate to admin page");
}

	
	
	
	

}
