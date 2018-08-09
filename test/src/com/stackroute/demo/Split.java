package com.stackroute.demo;

public class Split {

	public static void main(String[] args) { 
			String s1="java string split method";  
			String[] words=s1.trim().split("\\s"); 
			for(String w:words){  
			System.out.println(w);  
			}   
	}

}
/*
 public class Trim {  
    public static void main(String[] args) {  
        String s1 ="  hello java string   ";  
        System.out.println(s1.length());  
        System.out.println(s1); //Before trim()  
        String tr = s1.trim();  
        System.out.println(tr.length());  
        System.out.println(tr); //After trim()  
    }  
}  
 */
