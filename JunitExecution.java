package com.java.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExecution {
	//string
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("Afterclass");
	}
	@After
	public void after() {
		System.out.println("after");
		Date d = new Date();
		System.out.println(d);
		
	}
	@Before
	public void before() {
		System.out.println("Before");
		Date d = new Date();
		System.out.println(d);
		
	}
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@Test
	public void test3() {
		System.out.println("Test3");
	}

}
