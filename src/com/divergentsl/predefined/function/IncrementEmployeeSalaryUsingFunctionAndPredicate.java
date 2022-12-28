package com.divergentsl.predefined.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp{
	String name;
	int salary;
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class IncrementEmployeeSalaryUsingFunctionAndPredicate {
	public static void main(String[] args) {
	  ArrayList<Emp> empList1=new ArrayList<>();
		  empList1.add(new Emp("A", 5000));
		  empList1.add(new Emp("D", 1000));
		  empList1.add(new Emp("B", 1500));
		  empList1.add(new Emp("C", 2000));
		  empList1.add(new Emp("F", 2500));
		  empList1.add(new Emp("E", 3000));
	  System.out.println(empList1);
	  ArrayList<Emp> empList2=new ArrayList<>();
	  
	  Predicate<Emp> checkSalary= emp->emp.salary>1500;
	  Function<Emp,Emp> incrementSalary= emp->{
		  								emp.salary+=1044;
		  								return emp;
	  									};
	  for(Emp emp:empList1) {
		  if(checkSalary.test(emp)) {  //Predicate(I)
			  incrementSalary.apply(emp);  //Function(I)
			  empList2.add(emp);
		  }
	  }
	  System.out.println(empList2);
	  
	  						
	  }
}
