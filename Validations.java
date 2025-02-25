package com.java.junit;

import org.junit.Test;

import junit.framework.Assert;

public class Validations {
	
	@Test
	public void user() {
		String s = "aiite";
		Assert.assertEquals(s, "aiite");
		System.out.println("user");
	}
	@Test
	public void pass() {
		String s = "aiite";
		Assert.assertTrue(s.contains("a"));
		System.out.println("pass");
	}
	@Test
	public void login() {
		String s = "aiite";
		Assert.assertFalse(s.contains("A"));
		System.out.println("login");
	}

}
