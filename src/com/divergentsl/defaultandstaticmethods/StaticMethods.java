package com.divergentsl.defaultandstaticmethods;

interface Interf{
	public static void m1() {
		System.out.println("Interface Static Method");
	}
}
	
//if there were normal classes, so we would get errors in all three classes because of rules;

class A implements Interf{
	public static void m1() {
		System.out.println("Class A Static Method");
	}
}

class B implements Interf{
	public void m1() {
		System.out.println("Class B Non-Static Method");
	}
}

public class StaticMethods implements Interf{
	private static void m1() {
		System.out.println("Class C Private Static Method");
	}
	
    public static void main(String[] args) {
    	A.m1();
    	
		B b=new B();
		b.m1();
		StaticMethods.m1();		
	}
}
