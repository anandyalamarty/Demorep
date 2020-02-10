package com.qa.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test
	public void test()
	{
		System.out.println("This is test #1");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before test #1");
	}

}
