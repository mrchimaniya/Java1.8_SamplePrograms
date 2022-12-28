package com.divergentsl.lamdaexpression;

import java.util.Arrays;
import java.util.List;

public class IteratingOverListWithForEachByLamda{
	public static void main(String[] args) {
		List<String> name = Arrays.asList("AAA","BBB","CCC","DDD","EEE");
		
//		for (String feature : features) {
//		    System.out.println(feature);
//		}
		
		//lamda for consumer
		name.forEach( feature->System.out.println(feature) );		
	}
}