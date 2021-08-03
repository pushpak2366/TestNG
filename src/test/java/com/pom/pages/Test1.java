package com.pom.pages;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Test1 {

	
	@Test(priority=-2)
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(true);

	}
	
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@Test(priority=-1)
	public void test3() {
		System.out.println("test3");

	}

}
