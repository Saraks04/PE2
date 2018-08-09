package com.stackroute.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Iter1Test {

	@Test
	public void test() {
         Iter1 i=new Iter1();
         int res=(int) i.inter(1);
         assertEquals(1,res);
	}

}
