package test.Automation_22may;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ohrmtest {
	WebDriver driver;
	@AfterTest
	void launchohrm()
	{
		driver.findElement(By.cssSelector("img[alt='profile picture']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		}
	@BeforeTest
	void ohrmlogin()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	@Test
	void ohrmlogout()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}
}
