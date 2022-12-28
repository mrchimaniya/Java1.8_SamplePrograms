package com.divergentsl.doublecolonoperator;

interface Interf1{
	public void m1();
}

public class MethodReferenceStaticMethod {
	
   public static void m2()
   {
	   System.out.println("Method Refernce This o/p Is From m2() Method");
   }
	
   public static void main(String[] args) {
	 Interf1 interf1=MethodReferenceStaticMethod::m2;
	 interf1.m1();
   }
}
