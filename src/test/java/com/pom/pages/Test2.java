package com.pom.pages;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=2)
	public void test4() {
		System.out.println("test4");

	}
	
	
	@Test
	public void test5() {
		System.out.println("test5");

	}
	
	@Test(priority=1)
	public void test6() {
		System.out.println("test6");

	}
	

}
