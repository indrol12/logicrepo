package test.Automation_22may;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://court.mah.nic.in/courtweb/index.php#");
		
		//Actions class is used to perform mouse hover actions
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("प्रकरणाची सद्यःस्थिती"))).build().perform();
		
		driver.findElement(By.linkText("वकीलांचे नाव")).click();
		
		//alert clASS IS USED TO HANDLE ALERT BOX
		
		Alert a=driver.switchTo().alert();
		
	     a.accept();
	
	}

}
