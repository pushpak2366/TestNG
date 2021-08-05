package com.pom.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test(retryAnalyzer=com.pom.Listener.MyRetry.class)
	public void test5() {
		
		System.out.println("hello");
		
		
	}

}
