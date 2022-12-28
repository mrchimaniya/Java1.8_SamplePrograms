package com.divergentsl.dateandtime.joda;
import java.time.LocalTime;

public class LocalTime_Example {
	public static void main(String[] args) {	  	
	  	LocalTime time=LocalTime.now();
	  	int h=time.getHour();
	  	int m=time.getMinute();
	  	int s=time.getSecond();
	  	int n=time.getNano();
	  	System.out.printf("Current Time %d-%d-%d",h,m,s,n);
	}
}
