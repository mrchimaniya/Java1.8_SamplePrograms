package com.divergentsl.lamdaexpression;

@FunctionalInterface
interface GenericInterf<T> {
    T genericFunction(T element);
}

public class GenericFunctionalWithLamda{
	public static void main(String[] args) {

		GenericInterf<String> reverseString= (str)->{
				String result = "";
	            for (int i=str.length()-1; i >= 0 ; i--)
		            result = result + str.charAt(i);
		        return result;
				};
		System.out.println("Reverse String Of Aayush: "+ reverseString.genericFunction("Aayush"));
		
		GenericInterf<Integer> factorial= (num)->{
			int result=1;
			for(int i=1; i<=num; i++)
				result=result*i;
	        return result;
			};
	    System.out.println("Factorial Of 5: "+ factorial.genericFunction(5));
		
	}
}