package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ohrmlogintest {
ChromeDriver driver;
	
	
	@Given("Orangehrm website should get launch")
	public void website_launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("Enter username & password")
	public void enter_data()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@Then("Login should be succeessfull")
	public void login()
	{
		driver.findElement(By.xpath("//button")).click();
		driver.close();
	}
	
	
	
	
	
	
	
}
