package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

public class EmptyCollection {
	public static void main(String[] args) {

		Predicate<String> predicate= val->val.length()>5;
		System.out.println(predicate.test("Aayush"));
		System.out.println(predicate.test("Aay"));
		
	}

}
