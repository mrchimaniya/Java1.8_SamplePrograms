package com.divergentsl.predefined.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee{
	int eno;
	String ename;
	double esal;
	public Employee(int eno, String ename, double esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}

public class PrintEmployeeDetailsByConsumer {
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<>();
        addEmployee(empList);
        Consumer<Employee> printEmpConsumer= employee->{
        									System.out.println("Eid:"+employee.eno);
        									System.out.println("Ename:"+employee.ename);
        									System.out.println("Esal:"+employee.esal); 
        									System.out.println("*************************");
        									};
        for(Employee e:empList) {
        	printEmpConsumer.accept(e);
        }
	}
	
	static void addEmployee(ArrayList<Employee> empList) {
		empList.add(new Employee(1,"Ram",5000));
		empList.add(new Employee(2,"Shyam",10000));
		empList.add(new Employee(3,"Chinny",15000));
		empList.add(new Employee(4,"Pinny",20000));
		empList.add(new Employee(5,"Tinny",25000));
	}
}
