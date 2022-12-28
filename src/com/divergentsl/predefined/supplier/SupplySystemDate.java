package com.divergentsl.predefined.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplySystemDate {
 public static void main(String[] args) {
	   Supplier<Date> passDate= ()->new Date();
	   System.out.println(passDate.get());
    
 }
}
