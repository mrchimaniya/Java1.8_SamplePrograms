package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperator_Interface {
	public static void main(String[] args) {
		BinaryOperator<Integer> bo= (i,j)->i+j;
		System.out.println(bo.apply(5,10));
		
		//if we have same input and return type and want to go with premitive type so use XxxBinaryOperator(I)
		IntBinaryOperator io= (i,j)->i*j;
		System.out.println(io.applyAsInt(5, 10));
	}
}
