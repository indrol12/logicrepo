package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {

	@Given("user should sign with gmail account")
	public void first()
	{
		System.out.println("sign up with gmail account");
	}
	@When("I enter valid email & password")
	public void second()
	{
		System.out.println("email: cravita@gmail.com");
		System.out.println("password: 12345");
	}
	@Then("login should be successfull")
	public void third()
	{
		System.out.println("login successfull");
	}
}
