package com.divergentsl.lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorSortingOnCollection
{
   public static void main(String[] args) {
	   
	ArrayList<Integer> list=new ArrayList<>();
	list.add(30);
	list.add(40);
	list.add(10);
	list.add(50);
	list.add(20);
	Collections.sort(list, (item1,item2)->(item1>item2)?-1:(item1<item2)?1:0 );
	System.out.println("ArrayList: "+list);
	
	//**********************
	
	TreeSet<Integer> treeSet=new TreeSet<Integer>( (item1,item2)->item2.compareTo(item1) );
	treeSet.add(30);
	treeSet.add(40);
	treeSet.add(10);
	treeSet.add(50);
	treeSet.add(20);
	System.out.println("TreeSet:   "+treeSet); 
    
	//**********************
	
	TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>( (item1,item2)-> -item1.compareTo(item2) );
	treeMap.put(30,"CCC");
	treeMap.put(40,"DDD");
	treeMap.put(10,"AAA");
	treeMap.put(50,"EEE");
	treeMap.put(20,"BBB");
	System.out.println("TreeMap:   "+treeMap); 
  }
}