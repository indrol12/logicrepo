package test.Automation_22may;

import org.openqa.selenium.chrome.ChromeDriver;

public class fcttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\8april_testing_batch\\Automation_22may\\resource\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://fortunecloudindia.com/");
		
		
		
		System.out.println("*VERIFICATION OF WEBSITE TITLE*");
		
		String expected_title="Home | Fortune Cloud Technologies Private Limited";
		
		String actual_title=driver.getTitle();
		
		System.out.println("expected title is:  "+expected_title);
		
		System.out.println("actual title is  :  "+actual_title);
         if(expected_title.equals(actual_title))	
         {
        	 System.out.println("hence,fortune cloud title is matching");
         }
         else
         {
        	 System.out.println("hence,fortune cloud title is not matching");
         }
         driver.close();
	}

}
