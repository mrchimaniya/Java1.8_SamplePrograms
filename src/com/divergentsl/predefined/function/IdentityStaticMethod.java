package com.divergentsl.predefined.function;

import java.util.function.Function;

//if you want same identical value means same identity
//it gives same thing what you passed in it
public class IdentityStaticMethod {
   public static void main(String[] args) {
	 String name="Aayush";
	 Integer num=100;
	
	 Function<String,String> nameBack=Function.identity();
	 Function<Integer,Integer> numBack=Function.identity();
	 	 
	 System.out.println(nameBack.apply(name));
	 System.out.println(numBack.apply(num));
	 
	 System.out.println(Function.identity().apply("Direct Using"));
   }
}
