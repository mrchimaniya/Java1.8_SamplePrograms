package com.divergentsl.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filter_even_number {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(0);l.add(10);l.add(20);l.add(5);l.add(25);l.add(35);l.add(30);
		System.out.println(l);
		List<Integer> newList=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}
}
