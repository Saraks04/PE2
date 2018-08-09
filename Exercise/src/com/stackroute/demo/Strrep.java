package com.stackroute.demo;
import java.util.*;
class Strlim{
	String str3="";
	public void dis(String str1, int str2) 
	{
		System.out.print(str1);
		for(int i=str1.length()-(str2);i<(str1.length());i++)
		{
			str3=str3+str1.charAt(i);
		}
		for(int i=0;i<str3.length();i++)
		{
			 System.out.print(str3);
	    }
	}
}
public class Strrep 
{
	public static void main(String args[])
	{
		String str1;
		int str2;
		Strlim m=new Strlim();
		System.out.println("Enter a string and a integer");
		Scanner s=new Scanner(System.in);
		str1= s.nextLine();
		str2= s.nextInt();
		m.dis(str1,str2);
	}
}
