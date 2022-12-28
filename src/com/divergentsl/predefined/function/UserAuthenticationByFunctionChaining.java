package com.divergentsl.predefined.function;

import java.util.function.Function;

public class UserAuthenticationByFunctionChaining {
	public static void main(String[] args) {
		String username="DivergentSoftwareLabs";
		String password="div@123";
		
		Function<String,String> shortUsername= user->user.substring(0,9);
		Function<String,String> lowerCase= user->user.toLowerCase();
		if( shortUsername.andThen(lowerCase).apply(username).equals("divergent")
				&& password.equals("div@123")) {
			System.out.println("Valid User");
		}
		else {
			System.out.println("Invalid User");
		}
	}
}
