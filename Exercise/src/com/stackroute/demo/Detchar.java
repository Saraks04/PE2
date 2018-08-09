package com.stackroute.demo;
import java.util.*;
public class Detchar 
{

	public static void main(String[] args) 
	{
		char c;
		System.out.println("Enter the Character");
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		if(Character.isUpperCase(c))
			System.out.println("Capital Letter");
		
		else if(Character.isLowerCase(c))
			System.out.println("Small Letter");
			
		else if(Character.isDigit(c))
			System.out.println("Digit");
		
		else
			System.out.println("Special Character");

	}

}
