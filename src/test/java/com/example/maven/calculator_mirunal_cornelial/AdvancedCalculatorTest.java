package com.example.maven.calculator_mirunal_cornelial;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator ca = new AdvancedCalculator();
	static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	@Test
	public void testRaiseToThePowerOf2() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			result = Math.pow(firstNumber, 2.0);
			LOG.info("Testing the method raise to the power of 2 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf2(firstNumber), result, 0);
		}
	}

	@Test
	public void testNegativeRaiseToThePowerOf2() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			result = Math.pow(firstNumber, 2.0);
			LOG.info("Testing the method negative raise to the power of 2 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf2(firstNumber), result, 0);
		}
	}

	@Test
	public void testZeroRaiseToThePowerOf2() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			result = Math.pow(firstNumber, 2);
			LOG.info("Testing the method zero raised to the power of 2 " + firstNumber);
			assertEquals(ca.raisedToThePowerOf2(firstNumber), result, 0);

		}

	}

	@Test
	public void testRaiseToThePowerOf3() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			result = Math.pow(firstNumber, 3.0);
			LOG.info("Testing the method raise to the power of 3 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf3(firstNumber), result, 0);
		}
	}

	@Test
	public void testNegativeRaiseToThePowerOf3() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			result = Math.pow(firstNumber, 3.0);
			LOG.info("Testing the method negative raise to the power of 3 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf3(firstNumber), result, 0);
		}
	}

	@Test
	public void testZeroRaiseToThePowerOf3() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			result = Math.pow(firstNumber, 3);
			LOG.info("Testing the method zero raised to the power of 3 " + firstNumber);
			assertEquals(ca.raisedToThePowerOf3(firstNumber), result, 0);

		}

	}

	@Test
	public void testRaiseToThePowerOf4() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			result = Math.pow(firstNumber, 4.0);
			LOG.info("Testing the method raise to the power of 4 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf4(firstNumber), result, 0);
		}
	}

	@Test
	public void testNegativeRaiseToThePowerOf4() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			result = Math.pow(firstNumber, 4.0);
			LOG.info("Testing the method negative raise to the power of 4 with " + firstNumber);
			assertEquals(ca.raisedToThePowerOf4(firstNumber), result, 0);
		}
	}

	@Test
	public void testZeroRaiseToThePowerOf4() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			result = Math.pow(firstNumber, 4);
			LOG.info("Testing the method zero raised to the power of 4 " + firstNumber);
			assertEquals(ca.raisedToThePowerOf4(firstNumber), result, 0);

		}

	}

	@Test
	public void testRemainder() {
		Random random = new Random();
		double dividend = 0;
		double divisor = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			dividend = random.nextDouble() * 50;
			divisor = random.nextDouble() * 50;
			result = dividend % divisor;
			LOG.info("Testing the method remainder with " + dividend + " and " + divisor);
			assertEquals(ca.remainder(dividend, divisor), result, 0);
		}
	}

	@Test
	public void testNegativeRemainder() {
		Random random = new Random();
		double dividend = 0;
		double divisor = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			dividend = random.nextDouble() * -50;
			divisor = random.nextDouble() * -50;
			result = dividend % divisor;
			LOG.info("Testing the method negative remainder with " + dividend + " and " + divisor);
			assertEquals(ca.remainder(dividend, divisor), result, 0);
		}
	}

	@Test
	public void testSquareRoot() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			result = Math.sqrt(firstNumber);
			LOG.info("Testing the method squareroot with " + firstNumber);
			assertEquals(ca.squareRoot(firstNumber), result, 0);
		}
	}

	@Test
	public void testNegativeSquareRoot() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			result = Math.sqrt(firstNumber);
			LOG.info("Testing the method negative SquareRoot with " + firstNumber);
			assertEquals(ca.squareRoot(firstNumber), result, 0);
		}
	}

	@Test
	public void testZeroSquareRoot() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			result = Math.sqrt(firstNumber);
			LOG.info("Testing the method zero SquareRoot " + firstNumber);
			assertEquals(ca.squareRoot(firstNumber), result, 0);

		}

	}

	@Test
	public void testCubeRoot() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			result = Math.cbrt(firstNumber);
			LOG.info("Testing the method cuberoot with " + firstNumber);
			assertEquals(ca.cubeRoot(firstNumber), result, 0);
		}
	}

	@Test
	public void testNegativeCubeRoot() {
		Random random = new Random();
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			result = Math.cbrt(firstNumber);
			LOG.info("Testing the method negative CubeRoot with " + firstNumber);
			assertEquals(ca.cubeRoot(firstNumber), result, 0);
		}
	}

	@Test
	public void testZeroCubeRoot() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			result = Math.cbrt(firstNumber);
			LOG.info("Testing the method zero CubeRoot " + firstNumber);
			assertEquals(ca.cubeRoot(firstNumber), result, 0);

		}

	}
}
