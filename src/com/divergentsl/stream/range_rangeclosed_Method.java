package com.divergentsl.stream;

import java.util.stream.IntStream;

public class range_rangeclosed_Method {
	
	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++)
//			System.out.print(i+",");
//		System.out.println();
		
		IntStream range=IntStream.range(0, 10);
		range.forEach(System.out::println);
		
		System.out.println("__________");
		
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
	}

}
