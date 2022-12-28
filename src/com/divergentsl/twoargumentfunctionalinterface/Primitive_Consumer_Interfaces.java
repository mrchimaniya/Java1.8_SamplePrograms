package com.divergentsl.twoargumentfunctionalinterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;

class Employee2{
	int id;
	double salary;
	long secondsWorked;
	
	public Employee2(int id, double salary, long secondsWorked) {
		super();
		this.id = id;
		this.salary = salary;
		this.secondsWorked = secondsWorked;
	}

	@Override
	public String toString() {
		return "id=" + id + ", salary=" + salary + ", secondsWorked=" + secondsWorked;
	}
	
	
}

public class Primitive_Consumer_Interfaces {
	public static void main(String[] args) {
		IntConsumer ic= i->System.out.println(i);
		ic.accept(15);
		
		LongConsumer il= i->System.out.println(i*10000000000000L);
		il.accept(15);
		
		DoubleConsumer dc= i->System.out.println(i);
		dc.accept(10.5);	
		
		ObjDoubleConsumer<Employee2> oc=(emp,increment)->emp.salary+=increment;
		Employee2 emp=new Employee2(1,1000,5678l);
		System.out.println(emp);
		oc.accept(emp, 255.5);
		System.out.println(emp);
	}
}
