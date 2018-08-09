package com.stackroute.demo;
import java.util.*;
class Arrange
{
	void com(int s[],int n)
	{   int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(s[i]<s[j]) 
				{
				  int t=s[i];
				  s[i]=s[j];
				  s[j]=t;
				}
			}
		}
	    for(int m=0;m<n;m++)
			{
				System.out.println("Sorted array:"+s[m]);
				if(s[m]%2==0)
					sum=sum+s[m];
			}
			if(sum>15)
				System.out.println("True");
			else
				System.out.println("False");
		
	}
}
public class sort 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s[]=new int[n];
        System.out.println("Enter the array numbers:");
        for(int i=0;i<n;i++)
        {
		 s[i]=sc.nextInt();
        }
		Arrange a=new Arrange();
		a.com(s,n);
	}
}
