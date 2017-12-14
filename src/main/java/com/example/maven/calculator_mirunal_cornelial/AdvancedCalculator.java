package com.example.maven.calculator_mirunal_cornelial;

/**
 * Class Advanced Calculator. This is our implementation of an advanced
 * calculator with six advanced operations. The methods take double as
 * parameters and returns a double value.
 * @author Cornelia, Miruna 
 * 
 */
public class AdvancedCalculator {
	/**
	 * raise to the power of 2 - raises the value of the base two times
	 * 
	 * @param base
	 * @return the result of the raising of the power of two
	 */
	public double raisedToThePowerOf2(double base) {
		return Math.pow(base, 2.0);
	}

	/**
	 * raise to the power of 3 - raises the value of the base three times
	 * 
	 * @param base
	 * @return the result of the raising of the power of three
	 */
	public double raisedToThePowerOf3(double base) {
		return Math.pow(base,  3.0);
	}

	/**
	 * raise to the power of 4 - raises the value of the base four times
	 * 
	 * @param base
	 * @return the result of the raising of the power of four
	 */

	public double raisedToThePowerOf4(double base) {
		return Math.pow(base, 4.0);
	}

	/**
	 * remainder - figures out the remainder operation of two numbers
	 * 
	 * @param dividend
	 * @param divisor
	 * @return the remainder when a value is divided
	 */
	public double remainder(double dividend, double divisor) {
		return dividend % divisor;
		
		/**
		 *
		 * squareRoot - figures out the square root of a double number
		 * 
		 * @param number
		 * @return a positive number of a double number
		 */
	}

	public double squareRoot(double number) {
		return Math.sqrt(number);
	}

	/**
	 * cubeRoot - figures out the cube root of a double number
	 * 
	 * @param number
	 * @return a positive number of a double number
	 */
	public double cubeRoot(double number) {
		return Math.cbrt(number);
	}

}