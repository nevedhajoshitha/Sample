package org.Junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) {
		Result result  = JUnitCore.runClasses(JunitMath1.class);
		System.out.println(result.getRunCount());
		System.out.println(result.getFailureCount());
		System.out.println(result.getRunTime());
		System.out.println(result.wasSuccessful());
	}
}
