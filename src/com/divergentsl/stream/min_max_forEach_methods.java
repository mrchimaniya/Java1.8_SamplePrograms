package com.divergentsl.stream;

import java.util.ArrayList;
import java.util.List;

public class min_max_forEach_methods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(30);list.add(10);list.add(20);list.add(5);list.add(25);list.add(35);list.add(30);
		
		Integer x=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(x);
		
		Integer x1=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(x1);
		
		System.out.println("_________");
	    list.stream().forEach(System.out::println);
	    list.forEach(i->System.out.print(i+100+" "));
	}
}
