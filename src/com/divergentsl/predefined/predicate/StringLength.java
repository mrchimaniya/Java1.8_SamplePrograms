package com.divergentsl.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class StringLength {
	public static void main(String[] args) {

		Predicate<Collection> predicate= c->c.isEmpty();
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Hello");
		System.out.println(predicate.test(al1));
		al1=new ArrayList<>();
		System.out.println(predicate.test(al1));
		
	}

}
