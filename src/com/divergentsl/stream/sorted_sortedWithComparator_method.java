package com.divergentsl.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sorted_sortedWithComparator_method {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(0);l.add(10);l.add(10);l.add(10);l.add(20);l.add(5);l.add(25);l.add(35);l.add(30);
		System.out.println(l);
		
	List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
	System.out.println(l1);
	
	List<Integer> l2=l.stream().sorted( (i1,i2)->i2.compareTo(i1) ).collect(Collectors.toList());
	System.out.println(l2);
	
    Set<Integer> s = l.stream().sorted().collect(Collectors.toSet());
	System.out.println(s);		
		
	}
}
