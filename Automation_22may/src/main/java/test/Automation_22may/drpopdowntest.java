package test.Automation_22may;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpopdowntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	    
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://court.mah.nic.in/courtweb/index.php#");
        
		
		
		//select class is used to handle dropdown element
		
		Select sel=new Select(driver.findElement(By.id("sess_dist_code")));
		//selectbyindex  or  selectbyvalue    or   select by visibletext
		
		//sel.selectByIndex(3);
		//sel.selectByValue("34");
		sel.selectByVisibleText("Pune-पुणे");
		
	}

}
