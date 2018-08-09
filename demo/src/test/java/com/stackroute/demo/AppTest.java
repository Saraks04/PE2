package com.stackroute.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testpalin() {
    	App a=new App();
    	int result=a.rev(232);
    	assertEquals(232,result);
    }
}