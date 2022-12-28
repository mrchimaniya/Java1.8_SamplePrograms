//package com.divergentsl.lamdaexpression;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Employee{
//	Integer id;
//	String name;
//	
//	Employee(int id,String name){
//		this.id=id;
//		this.name=name;
//	}
//	
//	@Override
//	public String toString() {
//		return "\nEmployee Id: "+id+" | Employee Name: "+name;
//	}
//}
//
//public class ComparatorSortingOnCustomObject
//{
//   public static void main(String[] args) {
//	ArrayList<Employee> employees=new ArrayList<Employee>();
//	employees.add(new Employee(1, "AAA"));
//	employees.add(new Employee(2, "BBB"));
//	employees.add(new Employee(3, "CCC"));
//	employees.add(new Employee(4, "DDD"));
//	employees.add(new Employee(5, "EEE"));
//	Collections.sort(employees, (item1,item2)-> item2.id.compareTo(item1.id) );
//	System.err.println(employees);
//  }
//}