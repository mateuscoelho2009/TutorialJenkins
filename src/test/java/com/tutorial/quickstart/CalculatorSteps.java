package com.tutorial.quickstart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {
	private Calculator calculator;
	
	@Before
	public void init() {
		calculator = new Calculator();
	}
	
	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertNotNull(calculator);
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) throws Throwable {
	    calculator.add(arg1, arg2);
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) throws Throwable {
	    assertEquals(arg1, calculator.getResult());
	}

	@When("^I multiply (\\d+) and (\\d+)$")
	public void i_multiply_and(int arg1, int arg2) throws Throwable {
		calculator.multiply(arg1, arg2);
	}
}
