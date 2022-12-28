package com.divergentsl.predefined.function;

import java.util.function.Function;

public class ClearDifferenceBetween_AndThen_Compose_Methods {
	public static void main(String[] args) {
		Function<Integer,Integer> add= i->i+i;
		Function<Integer,Integer> cube= i->i*i*i;
		
		System.out.println(add.apply(2));  //4
		System.out.println(cube.apply(2)); //8
		
		System.out.println(add.andThen(cube).apply(2)); //64
		
		System.out.println(cube.andThen(add).apply(2)); //16
		System.out.println(add.compose(cube).apply(2)); //16
	}
}
