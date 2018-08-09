package com.stackroute.demo;
import java.util.*;
public class Revstr {
	public static void main(String args[])
	{
		String s,rev="";
		System.out.println("Enter the string:");
		Scanner rd=new Scanner(System.in);
		s=rd.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
