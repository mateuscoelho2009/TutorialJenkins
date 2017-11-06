package com.tutorial.quickstart;

public class Calculator {
	
	private int result;
	
	public Calculator() {
		result = 0;
	}

	public void add(int arg1, int arg2) {
		result = arg1 + arg2;
	}

	public int getResult() {
		return result;
	}

	public void multiply(int arg1, int arg2) {
		result = arg1 * arg2;
	}

}
