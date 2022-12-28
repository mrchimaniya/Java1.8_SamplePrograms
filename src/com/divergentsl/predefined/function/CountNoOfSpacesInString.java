package com.divergentsl.predefined.function;

import java.util.function.Function;

public class CountNoOfSpacesInString {
	public static void main(String[] args) {
		String name="Divergent Software Labs Pvt Ltd";
		Function<String,Integer> removeSpaces= str-> str.length()-str.replaceAll(" ","").length();
		System.out.println(removeSpaces.apply(name));
	}	
}
