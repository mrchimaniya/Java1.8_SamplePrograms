//package com.divergentsl.lamdaexpression;
//import java.util.ArrayList;
//import java.util.Collections;
//
//interface Interf{
//	public void interfMethod();
//}
//
//public class ThisKeywordWithLamda
//{
//	int x=888;
//	public void classMethod()
//	{
//		Interf interf=()->{
//			    int x=999;
//				System.out.println(this.x); //In Lamda Expression You Can'nt Declare Instance Variable
//		};									// any variable you declare inside lamda is always local variable of lamda expression
//		interf.interfMethod();
//	}
//	
//   public static void main(String[] args) {
//	  ThisKeywordWithLamda invoke=new ThisKeywordWithLamda();
//	  invoke.classMethod();
//   }
//}