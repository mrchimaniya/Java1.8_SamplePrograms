package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Primitive_Predicte_Interfaces {
	public static void main(String[] args) {
		IntPredicate ip= i->i%2==0;
		System.out.println(ip.test(15));
		
		
		LongPredicate lp=l->l>100;
		System.out.println(lp.test(50));
		
		DoublePredicate dp=d->d>10.5;
		System.out.println(dp.test(15.5));
	
	}
}
