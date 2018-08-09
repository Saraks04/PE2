package com.stackroute.demo;
import java.util.*;
public class Iter 
{
	public static void main(String args[])
	{
		int m;
		System.out.println("Enter the number:");
		Scanner n=new Scanner(System.in);
		m=n.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++)
			{
			 System.out.println(i);
			}
		}   
	}

}
