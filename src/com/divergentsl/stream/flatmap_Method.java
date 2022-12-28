package com.divergentsl.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap_Method {
	
	public static void main(String[] args) {

	  List<Integer> primeNumbers=Arrays.asList(3,5,7,11,13);
	  List<Integer> oddNumber=Arrays.asList(1,3,5,7);
	  List<Integer> evenNumber=Arrays.asList(2,4,6,8,10);
	  
	  List<List<Integer>> mergedList=Arrays.asList(primeNumbers,oddNumber,evenNumber);
	  System.out.println(mergedList);
	  List<Integer> finalList = mergedList.stream().flatMap(li->li.stream()).collect(Collectors.toList());
	  System.out.println(finalList);
	  
	  List<Integer> finalList1 = mergedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
	  System.out.println(finalList1);
	  
	  System.out.println("_____Even Numbers");
	  mergedList.stream().flatMap(list->list.stream()).filter(i->i%2==0).forEach(System.out::println);
	  System.out.println("_____All Unique Elements");
	  mergedList.stream().flatMap(li->li.stream()).distinct().forEach( System.out::println );
	}

}
