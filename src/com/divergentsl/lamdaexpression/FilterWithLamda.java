package com.divergentsl.lamdaexpression;
import java.util.ArrayList;
import java.util.stream.Stream;

class Employee{
	Integer id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Employee Id: "+id+" | Employee Name: "+name;
	}
}

public class FilterWithLamda
{
   public static void main(String[] args) {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(1, "AAA"));
	employees.add(new Employee(2, "BBB"));
	employees.add(new Employee(3, "CCC"));
	employees.add(new Employee(4, "DDD"));
	employees.add(new Employee(5, "EEE"));
	
	System.out.println("Employees Whose Id Greater Than 2");
	//lambda to filter data  
	Stream<Employee> filteredEmployee = employees.stream().filter( emp->emp.id>2 );  
    
    //lambda to iterate through forEach() method
    filteredEmployee.forEach( emp->System.out.println(emp) ); 
    
    //or
//    employees.stream().filter(emp->emp.id>2).forEach( emp->System.out.println(emp) );
   
  }
}