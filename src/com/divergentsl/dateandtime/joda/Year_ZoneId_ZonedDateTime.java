package com.divergentsl.dateandtime.joda;

import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Year_ZoneId_ZonedDateTime {
  
	public static void main(String[] args) {
		int i=2015;
		Year y=Year.of(i);
		if(y.isLeap())
			System.out.printf("%d Is A Leap Year",y.getValue());
		else
			System.out.printf("%d Is Not A Leap Year",y.getValue());
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println("\n"+zone);
		
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z);
		
		ZoneId losAng=ZoneId.of("Asia/Kolkata");
		ZonedDateTime dt=ZonedDateTime.now(losAng);
		System.out.println(dt);
	}
}
