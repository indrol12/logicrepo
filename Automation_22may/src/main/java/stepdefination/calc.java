package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class calc {
ChromeDriver driver;

	@Given("calculator website should get launch")
	public void launch_calc()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    driver.get("https://www.calculator.net/");
	}
	@When("I click on number 1 , number 4 & + operator")
	public void add()
	{
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		
	}
	@And("I click on number 6 , number 8 & - operator")
	public void sub()
	{
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
	    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
	}
}
