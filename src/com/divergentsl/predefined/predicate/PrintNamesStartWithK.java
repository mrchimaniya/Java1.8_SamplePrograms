package com.divergentsl.predefined.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PrintNamesStartWithK {
	public static void main(String[] args) {

		String[] names= {"Aayush","",null,"Komal","","Shyam",null,"Seeta"};
		ArrayList<String> aList=new ArrayList<>();
		Predicate<String> remove= s-> s!=null && s.length()!=0;
		for(String name:names) {
			if(remove.test(name))
				aList.add(name);
		}	
		System.out.println(aList);
	}
}
