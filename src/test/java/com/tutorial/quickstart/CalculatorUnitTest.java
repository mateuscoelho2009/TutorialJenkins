package com.tutorial.quickstart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorUnitTest {

	private Calculator calc_;
	
	@Before
	public void init() {
		calc_ = new Calculator();
	}
	
	@Test
	public void WhenCreatingNewCalculatorObjectIsNotNull() {
		assertNotNull(calc_);
	}
	
	@Test
	public void WhenAddingTwoNumbersCalculatorReturnsTheCorrectSum() {
		calc_.add(3, 7);
		assertEquals(10, calc_.getResult());
	}
	
	@Test
	public void WhenMultiplingTwoNumbersCalculatorReturnsTheCorrectProduct() {
		calc_.multiply(3, 7);
		assertEquals(21, calc_.getResult());
	}

}
