package test.Automation_22may;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class OHRM_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	//impicit wait
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("admin");
    //driver.findElement(By.tagName("input")).sendKeys("admin");
	
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	//driver.findElement(By.tagName("button")).click();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//div/button")).click();
	driver.findElement(By.xpath("//button")).click();
	
	driver.findElement(By.cssSelector("img[alt='profile picture']")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.partialLinkText("Log")).click();
	}

}
