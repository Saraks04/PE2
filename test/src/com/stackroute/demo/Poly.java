package com.stackroute.demo;
public class Poly { 
	  void sum(int a,int b)
	  {
		  System.out.println(a+b);
	  }  
	  void sum(int a,char b,int c)
	  {
		  System.out.println('b'+ "=" + (a+c));
	  }  
	  public static void main(String args[]) 
	  {  
	    Poly obj=new Poly();  
	    obj.sum(10,'s',60);  // 90
	    obj.sum(20,30);     //50 
	  }  
	}  

/*
Class Base
	{
		Public void show ()
		{ 
			System.out.println("From base class show method");
		}
	}
Public Class Poly : BaseClass
	{
		Public void show()
		{
         System.out.println("From Derived Class show method");
		}
		Public static void main(String args[])
		{
			Poly dp=new Poly ();
			dp.show();

		}
	}

*/