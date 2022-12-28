package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

public class PredicateJoinings {
	
	public static void m1(Predicate<Integer> predict,int[] val) {
		for(int value:val) {
			if(predict.test(value))
				System.out.print(value+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Predicate<Integer> p1= i->i>10;
		Predicate<Integer> p2= i->i%2==0;
		int[] val= {0,5,10,15,20,25,30,35,40};
		
		PredicateJoinings.m1(p1, val);
		PredicateJoinings.m1(p2, val);
		
		PredicateJoinings.m1(p1.negate(), val);
		
		PredicateJoinings.m1(p1.and(p2), val);
		PredicateJoinings.m1(p1.and(p2.negate()), val);
		PredicateJoinings.m1(p1.or(p2), val);		
	}
}
