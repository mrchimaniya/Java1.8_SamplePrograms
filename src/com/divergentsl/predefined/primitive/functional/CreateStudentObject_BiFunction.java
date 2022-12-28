package com.divergentsl.predefined.primitive.functional;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
}

public class CreateStudentObject_BiFunction {
  public static void main(String[] args) {
	ArrayList<Student> stdList=new ArrayList<>();
	BiFunction<Integer,String,Student> biFunction=(roll,name)->new Student(roll, name);
	
	stdList.add(biFunction.apply(101,"Aayush"));
	stdList.add(biFunction.apply(102,"Ram"));
	stdList.add(biFunction.apply(103,"Seeta"));
   
	for(Student std:stdList)
		System.out.println("Name: "+std.name+"\t Roll: "+std.roll);	
  }
}
