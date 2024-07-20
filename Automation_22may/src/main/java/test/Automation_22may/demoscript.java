package test.Automation_22may;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setup of webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		
		//creation of object of driver
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cravitaindia.com/index.html");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("current website title is: " +driver.getTitle());
		
		System.out.println("current website URL is: "+driver.getCurrentUrl());
		
		driver.close();
	}

}
