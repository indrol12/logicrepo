import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataproviderdemo {
  @Test(dataProvider = "data")
  public void sample(String username, String pass) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
          driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.tagName("button")).click();
		driver.close();
  }
  

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "pratikshalad@gmail.com", "lad123" },
      new Object[] { "aratiwaghmare@gmail.com", "arati123" },
      new Object[] { "vrushalisangar@gmail.com", "vrushali" },
      new Object[] { "poonam@gmail.com", "1234" },
      new Object[] { "prachi@gmail.com", "7890" },
      new Object[] { "yogeshwari@gmail.com", "1111" },
    };
  }
}
