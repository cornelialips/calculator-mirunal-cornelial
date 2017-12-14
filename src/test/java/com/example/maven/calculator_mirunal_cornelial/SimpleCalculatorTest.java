package com.example.maven.calculator_mirunal_cornelial;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class SimpleCalculatorTest {
	SimpleCalculator c = new SimpleCalculator();
	static final Logger LOG = Logger.getLogger(SimpleCalculator.class.getName());

	@Test
	public void testAddMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*50;
			secondNumber = random.nextDouble()*50;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with " + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result, 0);
		}
	}
	
	@Test
	public void testAddNegativeMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*-50;
			secondNumber = random.nextDouble()*-50;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add negative number with " + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result, 0);
		}
	}
	@Test
	public void testAddWithZero() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber =0;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result, 0);

			firstNumber = random.nextDouble() * 50;
			secondNumber = 0;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result, 0);

			firstNumber = 0;
			secondNumber = random.nextDouble() * 50;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with zero  with " + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result, 0);

		}

	}

	@Test
	public void testSubtractMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*50;
			secondNumber = random.nextDouble()*50;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method subtract with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result, 0);
		}
	}
	@Test
	public void testSubtractNegativeMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*-50;
			secondNumber = random.nextDouble()*-50;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method subtract negative number with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result, 0);
		}
	}
	@Test
	public void testSubtractWithZero() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber =0;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method subtract with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result, 0);

			firstNumber = random.nextDouble() * 50;
			secondNumber = 0;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method subtract with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result, 0);

			firstNumber = 0;
			secondNumber = random.nextDouble() * 50;
			result = firstNumber - secondNumber;
			LOG.info("Testing the method subtract with zero  with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result, 0);
			
		}
	}


	@Test
	public void testMultiplyMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*50;
			secondNumber = random.nextDouble()*50;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result, 0);
		}

	}
	@Test
	public void testMultiplyNegativeMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*-50;
			secondNumber = random.nextDouble()*-50;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method multiply negative number with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result, 0);
		}
	}
	@Test
	public void testMultiplyWithZero() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber =0;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method multiply with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result, 0);

			firstNumber = random.nextDouble() * 50;
			secondNumber = 0;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method multiply with zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result, 0);

			firstNumber = 0;
			secondNumber = random.nextDouble() * 50;
			result = firstNumber * secondNumber;
			LOG.info("Testing the method multiply with zero  with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result, 0);
			
		}
	}

	@Test
	public void testDivideMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * 50;
			secondNumber = random.nextDouble() * 50;
			result = firstNumber / secondNumber;
			LOG.info("Testing the method divide with " + firstNumber + " and " + secondNumber);
			assertEquals(c.division(firstNumber, secondNumber), result, 0);
		}
	}

	@Test
	public void testDivideByZero() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber =0;
			result = -0.123456789;
			LOG.info("Testing the method division by zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.division(firstNumber, secondNumber), result, 0);

			firstNumber = random.nextDouble() * 50;
			secondNumber = 0;
			result = -0.123456789;
			LOG.info("Testing the method division by zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.division(firstNumber, secondNumber), result, 0);

			firstNumber = 0;
			secondNumber = random.nextDouble() * 50;
			result = firstNumber / secondNumber;
			LOG.info("Testing the method division by zero with " + firstNumber + " and " + secondNumber);
			assertEquals(c.division(firstNumber, secondNumber), result, 0);

		}

	}

	@Test
	public void testDivideNegativeMethod() {
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble() * -50;
			secondNumber = random.nextDouble() * -50;
			result = firstNumber / secondNumber;
			LOG.info("Testing the method divide negative number with " + firstNumber + " and " + secondNumber);
			assertEquals(c.division(firstNumber, secondNumber), result, 0);

		}
	}
}