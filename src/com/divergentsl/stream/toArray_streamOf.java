package com.divergentsl.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class toArray_streamOf {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(30);list.add(10);list.add(20);list.add(5);list.add(25);list.add(35);list.add(30);
		
	    Integer[] array=list.stream().toArray(Integer[]::new);
	    for(int i: array)
	    	System.out.println(i);
	    
	    //For Group Of Elements
	    System.out.println("_____");
	    Stream<Object> s=Stream.of(1,2,3,4,5,"A","B","C");
	    s.forEach(System.out::println);
	    
	    //For Array
	    System.out.println("_____");
	    Double[] d= {10.1,10.2,10.3,10.4,10.5};
	    Stream<Double> s1=Stream.of(d);
	    s1.forEach(System.out::println);
	}
}
