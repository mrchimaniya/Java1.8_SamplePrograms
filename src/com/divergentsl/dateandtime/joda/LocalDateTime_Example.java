package com.divergentsl.dateandtime.joda;
import java.time.LocalDateTime;

public class LocalDateTime_Example {
	public static void main(String[] args) {	  	
	  	LocalDateTime dateTime=LocalDateTime.of(1995,05,28,12,45);
	  	System.out.println(dateTime);
	  			
	  	int year=dateTime.getYear();
	  	int month=dateTime.getMonthValue();
	  	int day=dateTime.getDayOfMonth();
	  	
	  	int h=dateTime.getHour();
	  	int m=dateTime.getMinute();
	  	int s=dateTime.getSecond();
	  	int n=dateTime.getNano();
	  	

	  	System.out.printf("Today Date Is %d-%d-%d",year,month,day);
	  	System.out.printf("\nCurrent Time %d-%d-%d\n",h,m,s,n);
	  	
	  	LocalDateTime new1=dateTime.plusMonths(6);
	  	System.out.println(new1);
	  	LocalDateTime new2=dateTime.minusMonths(6);
	  	System.out.println(new2);
	  	
	}
}
