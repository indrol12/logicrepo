package test.Automation_22may;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersintestng {

	@Parameters({"P","Q"})
	@Test
	void para(int a,int b)
	{
		System.out.println("Addition is :"+(a+b));
	}
}
