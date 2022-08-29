package by.academy.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

// добавить методы sum, substract, divide, multiply в Calculator
// Добавить тесты для каждого метода
public class CalculatorTest {

	private Calculator calculator;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before CalculatorTest.class");
	}

//	@AfterClass
//	public static void afterClass() {
//		System.out.println("After CalculatorTest.class");
//	}

	@Before
	public void initTest() {
		System.out.println("Before test call.");
		calculator = new Calculator();
	}

	@After
	public void afterTest() {
		System.out.println("After test call.");
		calculator = null;
	}

	@Test
	public void testSum() {
		System.out.println("testSum");
		Assert.assertEquals(4.0, Calculator.sum(2, 2));
	}

	@Test(timeout = 100)
	public void testTimeout() {
		System.out.println("testTimeout");
		int i = 0;

		while (i < 999) {
//			System.out.println("alalal");
			i++;
		}
	}

	@Test(expected = ArithmeticException.class)
	public void testExpected() {
		System.out.println("testExpected");
		int i = 1 / 0;
	}

	@Test
	@Ignore
	public void testFail() {
		System.out.println("testFail");
		Assert.fail("AHAHAHA!!!");
	}
}
