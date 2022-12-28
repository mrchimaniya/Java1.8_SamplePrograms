package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Primitive_Functional_Interfaces {
	public static void main(String[] args) {
		
		IntFunction<Integer> f= i->i*i;
		System.out.println(f.apply(15) );
		
		ToIntFunction<String> ti= str->str.length();
		System.out.println(ti.applyAsInt("Divergent Software Labs"));
		
		IntToDoubleFunction id=i->Math.sqrt(i);
		System.out.println(id.applyAsDouble(25));
		
	}
}
