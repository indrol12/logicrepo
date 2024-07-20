package test.Automation_22may;

import org.testng.annotations.Test;

public class priorityintestng {


         @Test(priority=0)
		void simple()
		{
			System.out.println("first test");
		}
         @Test(priority=1)
         void sample()
         {
        	 System.out.println("second test");
         }
	

}
