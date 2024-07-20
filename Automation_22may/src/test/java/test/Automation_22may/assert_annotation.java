package test.Automation_22may;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
public class assert_annotation {

	@Test
	void Assert_title() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.saucedemo.com/v1/");
		   
		   String expectedtitle="Swag Labs";
		   
		   String actualtitle=driver.getTitle();
		   
		   Assert.assertEquals(actualtitle,expectedtitle);
		   
		   driver.close();
	}
}
