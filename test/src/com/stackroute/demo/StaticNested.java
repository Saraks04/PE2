package com.stackroute.demo;

public class StaticNested {
	
	    static int data=30;
	    static class Inner{
	    void msg() {
	        System.out.println("data is" + " " + data);
	    }
	    }
	    public static void main(String args[]) {
	        StaticNested.Inner obj = new StaticNested.Inner();
	        obj.msg();
	    }

	}

	////this is example using instance method

/*  package example;

	public class StaticMethod {
	    static int data=30;
	    static class Inner{
	        static void msg() {
	            System.out.println("data is" + " " + data);
	        }
	    }
	public static void main(String args[]) {
	    StaticMethod.Inner.msg();
	}
	}

	////this is example using static method
*/
