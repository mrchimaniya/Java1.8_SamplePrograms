package com.divergentsl.predefined.supplier;

import java.util.function.Supplier;

public class SupplyRandomName {
 public static void main(String[] args) {
	 Supplier<String> randomName=()->{
			String[] s1= {"A","B","C","D"};
			int x=(int)(Math.random()*4);
			System.out.println(x);
			return s1[x];
			};
     System.out.println(randomName.get()); 
     System.out.println(randomName.get()); 
     System.out.println(randomName.get()); 
     System.out.println(randomName.get()); 
     System.out.println(randomName.get()); 
 }
}
