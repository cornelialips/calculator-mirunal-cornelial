package com.example.maven.calculator_mirunal_cornelial;
/**
 * 
 * Class SimpleCalculator.This is our implementation of a simple calculator. 
 * with four basic operations. The methods
 * take double as parameters and return a double value.
 * 
 *@author Cornelia, Miruna
 * 
 **/
public class SimpleCalculator implements CalculatorBasicOperations {
	
	
		/**
		 * Add- add two doubles.
		 * @param firstNumber : the first number as a double
		 * @param secondNumber: the second number as a double
		 * 
		 * @return: the result of the addition.
		 * */
		public double addition(double firstNumber, double secondNumber){
			return firstNumber+secondNumber;
		}
		
		/**
		 * subtract - subtracts two doubles.
		 * @param firstNumber : the first number as a double
		 * @param secondNumber: the second number as a double
		 * 
		 * @return: the result of the subtraction.
		 * */
		public double subtraction(double firstNumber, double secondNumber){
			return firstNumber-secondNumber;
		}
		
		/**
		 * multiply - multiplies two doubles.
		 * @param firstNumber : the first number as a double
		 * @param secondNumber: the second number as a double
		 * 
		 * @return: the result of the multiplication.
		 * */
		public double multiplication(double firstNumber, double secondNumber){
			return firstNumber*secondNumber;
		}
		
		/**
		 * divide- divides two doubles.
		 * @param firstNumber : the first number as a double
		 * @param secondNumber: the second number as a double
		 * 
		 * @return: the result of the division.
		 * */
		public double division(double firstNumber, double secondNumber){
			
			if (secondNumber == 0) {
			return -0.123456789;
			
			}
			return firstNumber/secondNumber;
		}
	
}
