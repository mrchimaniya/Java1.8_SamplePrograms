package com.divergentsl.predefined.primitive.functional;

import java.util.function.BiPredicate;

public class BiPredicate_Interface {
 public static void main(String[] args) {
   BiPredicate<Integer,Integer> check= (a,b)->(a+b)%2==0;
   System.out.println(check.test(10,20));
   System.out.println(check.test(10,25));   
 }
}
