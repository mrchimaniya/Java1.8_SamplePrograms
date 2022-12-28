package com.divergentsl.optional;

import java.util.Optional;

public class orelse_orelseget_orelsethrow_Method {

	public static void main(String[] args) {
		Optional<String> o1=Optional.ofNullable("Divergent");
		System.out.println(o1.get());
		//***ifPresent()
		o1.ifPresent( System.out::println );
		o1.ifPresent(str-> System.out.println(str.toUpperCase()));
		
		o1=Optional.empty();
		o1.ifPresent( System.out::println ); //not get o/p
		
		System.out.println("______orElse()__________________");//*******orElse()
		System.out.println(o1.orElse("Ram"));
		o1=Optional.ofNullable("Divergent");
		System.out.println(o1.orElse("Ram"));
		
		System.out.println("______orElseGet()_______________");//******orElseGet()
		o1=Optional.empty();
		System.out.println(o1.orElseGet( ()->"Ram" ));
		o1=Optional.ofNullable("Divergent");
		System.out.println(o1.orElseGet( ()->"Ram" ));		
		
		System.out.println("______orElseGetThrow()_______________");//******orElseGetThrow()
		o1=Optional.ofNullable("Divergent");
		System.out.println(o1.orElseThrow( IllegalArgumentException::new ));
		o1=Optional.empty();
		System.out.println(o1.orElseThrow( ArithmeticException::new ));
		   //or
		System.out.println(o1.orElseThrow( ()->new ArithmeticException() ));
	}
}
