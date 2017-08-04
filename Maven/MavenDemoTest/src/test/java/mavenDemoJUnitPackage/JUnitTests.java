package mavenDemoJUnitPackage;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

import mavenDemoPackage.Number1;
import mavenDemoPackage.Number2;
import mavenDemoPackage.Number3;
import mavenDemoPackage.Number7;

public class JUnitTests {

	@Test
	public void test7() {
		int [] expected = {62, 31, 10, 2, 0};	
		int[] temp;

		Number7 testClass = new Number7();
		
		temp = testClass.compute_value(60);
		assertArrayEquals(expected, temp);
		
	}
	
	@Test
	public void test1() {

		boolean result;
		
		result = Number1.cases(1);
		assertTrue(result);
		
	}
	
	@Test
	public void test2() {
		
		int result;
		
		result = Number2.run(5);
		assertEquals(8, result);
		
	}
	
	@Test
	public void test3() {
		
		int result;
		
		result = Number3.method(2, 2);
		assertEquals(26, result);
		
	}

}
