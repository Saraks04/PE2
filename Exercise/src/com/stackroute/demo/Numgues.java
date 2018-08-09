package com.stackroute.demo;
import java.util.*;
class Out
{   
	int orig=44;
	void cal(int m)
	{
	if(m>orig)
		System.out.println("Number guessed is greater than original");
	else if(m==orig)
		System.out.println("Number guessed is equal to original");
	else
		System.out.println("Number guessed is lesser than original");
	}
}
public class Numgues 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the input:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	    Out n1=new Out();
	    n1.cal(n);
	}

}
