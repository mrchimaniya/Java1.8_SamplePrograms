package com.divergentsl.predefined.function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}	
}

public class FindTotalSalaryOfEmployee {
	public static void main(String[] args) {
	  ArrayList<Employee> employeeList=new ArrayList<>();
	  employeeList.add(new Employee("Ram",500));
	  employeeList.add(new Employee("Shyam",1000.3));
	  employeeList.add(new Employee("Seeta",2000.7));
	  
	  Function<ArrayList<Employee>,Double> totalSalary= el->{
							    				    Double total=0.0;
							    				    for(Employee emp:el)
							    				    {
							    				    	total += emp.salary;
							    				    }
							    				    return total;
						  						};
	  System.out.println(totalSalary.apply(employeeList));
	  						
	  }
}
