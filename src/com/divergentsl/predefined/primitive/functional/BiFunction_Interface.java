package com.divergentsl.predefined.primitive.functional;

import java.util.function.BiFunction;

public class BiFunction_Interface {
  public static void main(String[] args) {
	BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a*b;
	System.out.println(biFunction.apply(10,20));
  }
}
