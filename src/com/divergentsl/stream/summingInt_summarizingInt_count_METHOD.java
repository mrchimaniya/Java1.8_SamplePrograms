package com.divergentsl.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class summingInt_summarizingInt_count_METHOD {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(0);l.add(10);l.add(20);l.add(5);l.add(25);l.add(35);l.add(30);
		
		System.out.println("Sum : "+l.stream().map(i->i).collect(Collectors.summingInt(Integer::intValue)));
		System.out.println("Total Data Summary: "+l.stream().map(i->i).collect(Collectors.summarizingInt(Integer::intValue)));
		System.out.println("Total Object No: "+l.stream().count());
	}
}
