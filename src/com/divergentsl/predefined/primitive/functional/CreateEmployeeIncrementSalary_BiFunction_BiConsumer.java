package com.divergentsl.predefined.primitive.functional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

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
		return name+" "+salary+"\n";
	}
	
	
}

public class CreateEmployeeIncrementSalary_BiFunction_BiConsumer {
  public static void main(String[] args) {
    ArrayList<Employee> empList=new ArrayList<>();
    BiFunction<String,Double,Employee> createEmp=(name,salary)->new Employee(name,salary);
    BiConsumer<Employee,Double> incrementSalary=(employee,increment)->employee.salary+=increment;
     
    empList.add(createEmp.apply("Aayush",10000.0));
    empList.add(createEmp.apply("Ram",20000.0));
    empList.add(createEmp.apply("Seeta",30000.0));
    System.out.println(empList);
    
    for(Employee emp:empList)
    {
    	incrementSalary.accept(emp,500.0);
    	System.out.print(emp.name+" "+emp.salary+"\n");
    }
//    System.out.println(empList);
  }
}
