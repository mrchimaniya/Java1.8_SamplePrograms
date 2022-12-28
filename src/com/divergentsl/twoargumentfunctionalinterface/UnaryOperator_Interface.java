package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperator_Interface {
	public static void main(String[] args) {
		UnaryOperator<Integer> o= i->i*i;
		System.out.println(o.apply(5));
		
		//if we have same input and return type and want to go with premitive type so use XxxUnaryOperator(I)
		IntUnaryOperator io= i->i*i;
		System.out.println(io.applyAsInt(6));
	}
}
