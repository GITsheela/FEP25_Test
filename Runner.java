package com.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//string
@RunWith(Suite.class)
@SuiteClasses({TestOne.class,TestTwo.class})
public class Runner {
	

}
