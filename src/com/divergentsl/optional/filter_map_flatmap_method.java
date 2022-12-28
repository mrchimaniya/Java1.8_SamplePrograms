package com.divergentsl.optional;

import java.util.Optional;

public class filter_map_flatmap_method {

	public static void main(String[] args) {
		
		System.out.println("______filter()______________");
		Optional<Integer> age=Optional.of(20);
	    age.filter(no->no<18).ifPresent(System.out::println);  //in this we will not get output
	      //or
	    System.out.println(age.filter(no->no>18).get());
	    
	    age=Optional.empty();
	    System.out.println(age.filter(no->no>18));
	    
	    System.out.println("______map()______________");
	    Optional<Integer> value=Optional.of(15);
	    value.map(no->no*no).ifPresent(System.out::println);  //in this we will not get output
	      //or
	    System.out.println(value.map(no->no+no).get());
	   
	    
	    
	}
}
