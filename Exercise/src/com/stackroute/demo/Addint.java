package com.stackroute.demo;
import java.util.*;
class Compute
{   int a;
	public int cal(int arr1[])
	{
		for(int i=0;i<arr1.length;i++) 
		{   
			int n=arr1[i];
			if(n==(int)n)
			{
				a+=arr1[i];
			}
			else
				System.out.println("Error,non-integer value");
		}
	return a;
	}
}
public class Addint 
{
	public static void main(String[] args) 
	{   
		int m,n;
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the limit");
	    n=sc.nextInt();*/
	    int arr[]=new int[5];
		System.out.println("Enter the array of elements");
		for(int i=0;i<arr.length;i++)
		{
			n=sc.nextInt();
			if(n==(int)n)
				arr[i]=n;
		}
		Compute c=new Compute();
		int res=c.cal(arr);
		System.out.println(res);
	}
}
