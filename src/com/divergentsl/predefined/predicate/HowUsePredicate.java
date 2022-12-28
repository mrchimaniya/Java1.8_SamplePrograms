package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

public class HowUsePredicate {
	
	//before 1.8
//	public boolean result(int val) {
//		if(val>10)
//			return true;
//		else 
//			return false;
//	}
	
	public static void main(String[] args) {
//	  HowUsePredicate pre=new HowUsePredicate();
//	  System.out.println(pre.result(10));
		
		Predicate<Integer> predicate= val->val>10;
		System.out.println(predicate.test(100));
		
	}

}
