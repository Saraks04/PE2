package com.stackroute.demo;
//Anonymous inner class created using methods of abstract classes or interface 
abstract class Person{  
	  abstract void eat();  
	}  
public class Testinner {
	 public static void main(String args[]){  
		  Person p=new Person(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  
}


/*interface Eatable{  
	 void eat();  
	}  
	class TestAnnonymousInner1{  
	 public static void main(String args[]){  
	 Eatable e=new Eatable(){  
	  public void eat(){System.out.println("nice fruits");}  
	 };  
	 e.eat();  
	 }  
	}  */