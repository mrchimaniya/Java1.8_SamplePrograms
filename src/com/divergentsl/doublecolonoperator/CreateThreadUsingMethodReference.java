package com.divergentsl.doublecolonoperator;

public class CreateThreadUsingMethodReference {
	
	public static void m1()
	{
		for(int i=0; i<10; i++)
		  System.out.println("M1 Static");
	}
	
	public void m2()
	{
		for(int i=0; i<10; i++)
		  System.out.println("M2 Instance");
	}
	
   public static void main(String[] args) {
	   Runnable r1= CreateThreadUsingMethodReference::m1;
	   Runnable r2= new CreateThreadUsingMethodReference()::m2;
	   
	   Thread t1=new Thread(r1);
	   Thread t2=new Thread(r2);
	   
	   t1.start();
	   t2.start();
	   
	   System.out.println("Main");	   
   }
}
