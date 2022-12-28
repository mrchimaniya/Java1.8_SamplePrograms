package com.divergentsl.doublecolonoperator;

class Sample
{
	Sample() {
		System.out.println("Sample Costructor Execution & Object Creation");
	}
}

interface Interf{
	public Sample get();
}


public class ConstructorReference {
	public static void main(String[] args) {
     Interf interf=Sample::new;
     Sample s=interf.get();
	}
}
