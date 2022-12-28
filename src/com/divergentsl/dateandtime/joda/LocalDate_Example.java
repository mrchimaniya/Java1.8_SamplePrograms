package com.divergentsl.dateandtime.joda;
import java.time.LocalDate;

public class LocalDate_Example {
	public static void main(String[] args) {
	  	LocalDate date=LocalDate.now();
	  	System.out.println(date);
	  	int year=date.getYear();
	  	int month=date.getMonthValue();
	  	int day=date.getDayOfMonth();
	  	System.out.printf("Today Date Is %d-%d-%d",year,month,day);
	  	System.out.println("\n"+date.getMonth());
	  	System.out.println(date.getDayOfYear());
	}
}
