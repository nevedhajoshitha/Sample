package org.Junit;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class JunitMath1 {

	MathClass math = new MathClass();
	
	@Test
	public void Addition()
	{
		System.out.println("Test started");
		int sum = math.Add(5, 3);
		System.out.println(sum);
	}
	
	@Test
	public void Addition1()
	{
		int a=2;
		int b=3;
		assertEquals(a+b, math.Add(a, b));
			
	}
	@Test
	public void Subtraction()
	{
		System.out.println("Test Started");
		int x = 10;
		int y = 5;
		int z = math.Subtract(x, y);
		System.out.println(z);
	}
	
	@Test
	public void Multiplication()
	{
		System.out.println("Test started");
		int x = math.Multiply(5, 5);
		System.out.println(x);
	}
	
}
