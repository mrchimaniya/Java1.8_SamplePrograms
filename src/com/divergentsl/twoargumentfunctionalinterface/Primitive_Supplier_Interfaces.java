package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.IntSupplier;

public class Primitive_Supplier_Interfaces {
	public static void main(String[] args) {
		
		IntSupplier is= ()->(int)(Math.random()*10);
		String otpOfSixDigit="";
		for(int i=0; i<6; i++)
		  otpOfSixDigit+=is.getAsInt();
		System.out.println(otpOfSixDigit);
	}
}
