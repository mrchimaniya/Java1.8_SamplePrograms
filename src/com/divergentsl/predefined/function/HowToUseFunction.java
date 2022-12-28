package com.divergentsl.predefined.function;

import java.util.function.Function;

public class HowToUseFunction {
	public static void main(String[] args) {
		Function<Integer,Integer> square= var->var*var;
		System.out.println(square.apply(5));
		
		//Return Type Is Different
		Function<String,Integer> length= s->s.length();
		System.out.println(length.apply("Aayush"));
	}	
}
