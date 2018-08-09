package com.stackroute.demo;
import java.util.*;
import static java.lang.Math.*;
class Num
{
	void type(int m)
	{
		if(((m%2)==0) && m>=20 && m<=30)
			System.out.println("Jerry");
		else if(((m%2)!=0) && m>=20 && m<=30)
			System.out.println("Tom");
		else    
			System.out.println("Not in range");
	}
}
public class Numtype 
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Num n1=new Num();
		n1.type(n);
	}

}
