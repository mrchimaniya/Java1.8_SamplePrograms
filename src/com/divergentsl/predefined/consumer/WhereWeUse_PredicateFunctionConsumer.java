package com.divergentsl.predefined.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	int sid;
	String sname;
	float smarks;
	
	public Student(int sid, String sname, float smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snameString=" + sname + ", marks=" + smarks + "]";
	}	
}

public class WhereWeUse_PredicateFunctionConsumer {
  public static void main(String[] args) {
	  ArrayList<Student> stdList=new ArrayList<>();
	  addStudent(stdList);
	Predicate<Student> checkMarks= std->std.smarks>65;
	Function<Student,String> assignGrade= std->{
										float marks=std.smarks;
										return (marks>=80)?"A Grade":
											   (marks>=70)?"B Grade":
											   (marks>=60)?"C Grade":
											   (marks>=33)?"D Grade":
											   "Failed";
									 };
	Consumer<Student> printStd= std->{
		 							System.out.println("StdNo: "+std.sid);
		 							System.out.println("StdName: "+std.sname);
		 							System.out.println("StdMarks: "+std.smarks);
		 							System.out.println("StdGrade: "+assignGrade.apply(std));
								     };
	for(Student std:stdList) 
		if(checkMarks.test(std))
			 printStd.accept(std);	
  }
  
  static void addStudent(ArrayList<Student> stdList) {
	  stdList.add(new Student(1,"Chinny",80));
	  stdList.add(new Student(2,"Pinny",70));
	  stdList.add(new Student(3,"Tinny",60));
	  stdList.add(new Student(4,"Sinny",50));
	  stdList.add(new Student(5,"Ginny",30));
	  
  }
}
