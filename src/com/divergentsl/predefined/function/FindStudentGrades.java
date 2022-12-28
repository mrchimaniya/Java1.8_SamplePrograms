package com.divergentsl.predefined.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

//here we will use Predicate and Function Interface Both
public class FindStudentGrades {
	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<>();
		addStudentObject(studentList);
		
		Function<Student,String> findGrade= student->{
								int marks=student.marks;
								return (marks>=80)?"A Grade":(marks>=60)?"B Grade":(marks>=50)?"C Grade":(marks>=33)?"D Grade":"Failed";
							};	
		for(Student std:studentList)
		{
			System.out.print("Name:"+std.name);
			System.out.print(", Marks:"+std.marks);
			System.out.print(", Grade:"+findGrade.apply(std)+"\n");
			
		}
		
		System.out.println("\nOnly Students Those Got Marks Greater Than 70***");
		Predicate<Student> topperStudents= student->student.marks>=70;
		for(Student std:studentList)
		{
		   if(topperStudents.test(std))
		   {
			System.out.print("Name:"+std.name);
			System.out.print(", Marks:"+std.marks);
			System.out.print(", Grade:"+findGrade.apply(std)+"\n");
		   }
			
		}
	}
	
	static void addStudentObject(ArrayList<Student> studentList) {
		studentList.add(new Student("Sunny",100));
		studentList.add(new Student("Bunny",70));
		studentList.add(new Student("Chinny",65));
		studentList.add(new Student("Vinny",45));
		studentList.add(new Student("Pinny",25));
	}
}
