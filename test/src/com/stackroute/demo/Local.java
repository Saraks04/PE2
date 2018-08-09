package com.stackroute.demo;

public class Local {
    int num=20;
    void display()
    {
    	class Inner
    	{
    		void msg()
    		{
    			System.out.println(num);
    		}
    	}
    	Inner l=new Inner();
    	l.msg();
    }
	public static void main(String[] args) {
		Local l=new Local();
		l.display();

	}

}
