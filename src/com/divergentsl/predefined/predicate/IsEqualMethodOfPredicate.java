package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

class Employee{
  private String name;
  private String designation;
   
	public Employee(String name, String designation) {
	this.name = name;
	this.designation = designation;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class IsEqualMethodOfPredicate{
	public static void main(String[] args) {
		Employee employee1=new Employee("A","Marketing Manager");
		Employee employee2=new Employee("B","Human Resource");
		
		Predicate<Employee> marketingManager= Predicate.isEqual(employee1);
		System.out.println(marketingManager.test(employee2));
		
		Predicate<String> result=Predicate.isEqual("Aayush");
		System.out.println(result.test("Aayush"));
		System.out.println(result.test("Divergent"));
		System.out.println(Predicate.isEqual("Direct_Use").test("Direct_Use"));
	}
}