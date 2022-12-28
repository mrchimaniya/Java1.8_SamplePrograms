package com.divergentsl.dateandtime.joda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class parse_format_mehtod {
  public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	String s=date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println(s);
	
	LocalDate date2=LocalDate.parse(s);
	System.out.println(date2);
	
	LocalDate date3=LocalDate.parse("19980428",DateTimeFormatter.BASIC_ISO_DATE);
	System.out.println(date3);
  }
}
