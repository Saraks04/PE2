package com.stackroute.demo;
import java.util.*;
class Comp 
{
	public void rev(int num)
	{   
		int n,orig;
	    int reve=0,sum=0;
	    orig=num;
		while(num>0)
		{
			n=num%10;
			reve=reve*10+n;
			num=num/10;
			if((n%2)==0)
			{
			  sum=sum+n;		
			}
		}
		if(reve==orig) 
		{
			System.out.print(orig + "is palindrome");
			if(sum>25)
				System.out.println("and the sum is greater than 25");
		}
		else
			System.out.println(orig +"is not a palindrome");
	}
}
public class Palin
{
	public static void main(String[] args) 
	{
		int g;
		System.out.println("Enter the number to be reversed:");
		Scanner sc=new Scanner(System.in);
		g=sc.nextInt();
		Comp p =new Comp();
		p.rev(g);

	}

}
