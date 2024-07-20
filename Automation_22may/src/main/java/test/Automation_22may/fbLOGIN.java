package test.Automation_22may;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLOGIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//to findout webelement on the webpage
		//driver.findElement(By.name("email")).sendKeys("fct@cravita.com");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("cravita@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.tagName("button")).click();
	}

}
