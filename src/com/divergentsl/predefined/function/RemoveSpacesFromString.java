package com.divergentsl.predefined.function;

import java.util.function.Function;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		String name="Divergent Software Labs Pvt Ltd";
		Function<String,String> removeSpaces= str->str.replaceAll(" ","");
		System.out.println(removeSpaces.apply(name));
	}	
}
