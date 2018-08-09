package com.stackroute.demo;
import java.util.*;
public class Vowcon 
{

	public static void main(String[] args) 
	{
		String s1;
		int n;
		System.out.println("Enter the string:");
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		n=s1.length();
		for(int i=0;i<n;i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				System.out.println(s1.charAt(i)+" is a vowel");
			else
				System.out.println(s1.charAt(i)+" is a consonant");
		}
	}

}
