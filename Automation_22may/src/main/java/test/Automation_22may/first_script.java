package test.Automation_22may;

import org.openqa.selenium.chrome.ChromeDriver;

public class first_script {
	
	public static void main(String[] args) {
		
       //setup of webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	
		
		//create the object of webdriver
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//opening website
		driver.get("https://www.flipkart.com/");
		
		//navigating to another website
		driver.navigate().to("https://www.meesho.com/");
		
		//driver.close();
		
		driver.quit();
		
		
		
	}

}

