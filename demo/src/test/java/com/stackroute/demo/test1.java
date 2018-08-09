package com.stackroute.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
	    	App a=new App();
	    	int result=a.rev(232);
	    	assertEquals(232,result);
	}

}
