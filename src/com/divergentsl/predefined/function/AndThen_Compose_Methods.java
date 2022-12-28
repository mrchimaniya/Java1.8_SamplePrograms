package com.divergentsl.predefined.function;

import java.util.function.Function;

public class AndThen_Compose_Methods {
	public static void main(String[] args) {
		String name="Divergent";
	    Function<String,String> upperCase= str->str.toUpperCase();
	    Function<String,String> firstFiveChar= str->str.substring(0,5);
	    System.out.println(upperCase.apply(name));
	    System.out.println(firstFiveChar.apply(name));
	    System.out.println(upperCase.andThen(firstFiveChar).apply(name));
	}	
}
