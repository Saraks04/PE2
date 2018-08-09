package com.stackroute.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest 
{
			@Test
			Add ad=new Add();
			public void test1() 
			{
				String exp=Integer.toString(2);
				String res=ad.cal(2);
				assertEquals(exp,res);
			}
			public void test2()
			{
				String exp=Integer.toString(-2);
				String res=ad.cal(-2);
				assertEquals(exp,res);
			}
			public void test3()
			{
				String exp=Integer.toString(0);
				String res=ad.cal(0);
				assertEquals(exp,res);
			}
        public void testdef() {
		fail("Not yet implemented");
        }
}


