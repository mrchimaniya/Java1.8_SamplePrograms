package com.divergentsl.dateandtime.joda;

import java.time.LocalDate;
import java.time.Period;

public class Period_Example {
  
	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(1998, 04, 28);
		LocalDate today=LocalDate.now();
		
		Period age=Period.between(birthday, today);
		System.out.println(age);
		System.out.printf("My Age Is %d Years %d Months %d Days",age.getYears(),age.getMonths(),age.getDays());
		
		LocalDate deathDays=LocalDate.of(1998+75,04,28);
		Period death=Period.between(today, deathDays);
		System.out.printf("\nWe Will Die On %d-%d-%d",death.getDays(),death.getMonths(),death.getYears());
	}
}
