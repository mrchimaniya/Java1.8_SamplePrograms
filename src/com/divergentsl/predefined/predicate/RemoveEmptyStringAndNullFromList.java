package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

public class RemoveEmptyStringAndNullFromList {
	public static void main(String[] args) {

		String[] names= {"Aayush","Karam","Komal","Ram","Shyam","Kritagya"};
		Predicate<String> startWithK= s->s.charAt(0)=='K';
		for(String name:names) {
			if(startWithK.test(name))
				System.out.println(name);
		}	
	}
}
