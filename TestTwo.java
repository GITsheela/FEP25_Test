package com.java.junit;

import org.junit.Ignore;
import org.junit.Test;

public class TestTwo {
	
	@Test
	public void userName() {
		System.out.println("Test1 : user");
	}
	@Ignore
	@Test
	public void password() {
		System.out.println("Test2 : pass");
	}
	@Test
	public void login() {
		System.out.println("Test3 : Login");
	}

}
