package com.divergentsl.optional;

import java.util.Optional;

public class Optional_empty_of_ofNullable_get_isPresent_Method {

	public static void main(String[] args) {
		Optional<String> o1=Optional.empty();
		System.out.println(o1);
//		System.out.println(o1.get());  RE: NoSuchElementException:No Value Present
		
	    String str="Divergent";
		
		Optional<String> o2=Optional.of(str);
		System.out.println(o2);
		System.out.println(o2.get());
		
		Optional<String> o3=Optional.ofNullable(str);
		System.out.println(o3);
		
		String emptyString=null;
		
//		Optional<String> o4=Optional.of(emptyString);
//		System.out.println(o4.get());
		
		
		Optional<String> o5=Optional.ofNullable(emptyString);
		System.out.println(o5);
		
		if(o5.isPresent())
		  System.out.println(o5.get());  //RE: NoSuchElementException:No Value Present
	}
}
