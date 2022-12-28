package com.divergentsl.predefined.supplier;

import java.util.function.Supplier;

public class SupplySixDigitOTP {
 public static void main(String[] args) {
   Supplier<String> newOtp=()->{
	   					 String otp="";
	   					 for(int i=0;i<6;i++) {
	   						otp=otp+(int)(Math.random()*10); 
	   					  }
	   					 return otp;
   						};
  System.out.println(newOtp.get());
  System.out.println(newOtp.get());
  System.out.println(newOtp.get());
  System.out.println(newOtp.get());
  System.out.println(newOtp.get());
 }
}
