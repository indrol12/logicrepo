package test.Automation_22may;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
public class readingfile {

	@Test
	void read_file() throws IOException
	{
		FileReader f=new FileReader("C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\base.properties");
	    
		Properties pr=new Properties();
		
		pr.load(f);
		//orangehrm launch
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    d.get(pr.getProperty("ohrmurl"));
	    
	    //navigate to meesho
	    d.navigate().to(pr.getProperty("meeshourl"));
	    d.navigate().back();
	
	}
}
