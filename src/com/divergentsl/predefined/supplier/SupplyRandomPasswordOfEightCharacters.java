package com.divergentsl.predefined.supplier;

import java.util.function.Supplier;


//Password Must Be * Char;
//odd index values will be A-Z@$# in UPPERCASE
//even index values will be 0-9


public class SupplyRandomPasswordOfEightCharacters {
   public static void main(String[] args) {
	
	   Supplier<Integer> randomNum=()-> (int)(Math.random()*10);
	   Supplier<Character> randomChar= ()->{
		   						String charData="ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#";
		   						int x=(int)(Math.random()*29);
		   						return charData.charAt(x);
	   						};
	   Supplier<String> randomPassword= ()->{
		   						      String password="";
		   						      for(int i=0;i<8;i++) {
		   						    	if(i%2==0)
		   						    	{
		   						    	  password+=randomChar.get();
		   						    	}
		   						    	else {
		   						    		password+=randomNum.get();
		   						    	}
		   						      }
		   						      return password;
	   								};
	   								
	   	System.out.println(randomPassword.get());
	   	System.out.println(randomPassword.get());
	   	System.out.println(randomPassword.get());
	   	System.out.println(randomPassword.get());
	   	System.out.println(randomPassword.get());
	   
  }
}
