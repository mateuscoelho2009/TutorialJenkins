Feature: Calculator
  		 As a user
  		 I want to use a calculator
  		 So that I do not need to calculate myself

  Scenario: Add two numbers
			Given I have a calculator
    		When I add 7 and 3
    		Then the result should be 10
    		
  Scenario: Multiply two numbers
  			Given I have a calculator
  			When I multiply 7 and 3
  			Then the result should be 21