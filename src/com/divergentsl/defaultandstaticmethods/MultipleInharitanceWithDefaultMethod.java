package com.divergentsl.defaultandstaticmethods;

interface Left{
	default void m1(){
		System.out.println("Left Default m1()");
	}
}

interface Right{
	default void m1(){
		System.out.println("Right Default m1()");
	}
}


//In this case we will get ambiguity
public class MultipleInharitanceWithDefaultMethod implements Left,Right{
	
	//solution 1 you can override default method
//	public void m1() {
//		System.out.println("My Own Method");
//	}
	
	//solution 2 you can use super keyword syntax if you want specific interface method implementation
	public void m1()
	{
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		MultipleInharitanceWithDefaultMethod multiple=new MultipleInharitanceWithDefaultMethod();
		multiple.m1();
	}
}
