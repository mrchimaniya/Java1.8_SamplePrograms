//package com.divergentsl.lamdaexpression;
//import java.util.ArrayList;
//import java.util.Collections;
//
//interface Interf{
//	public void interfMethod();
//}
//
//public class ThisKeywordWithAnonymousInnerClass
//{
//	int x=888;
//	public void classMethod()
//	{
//		Interf interf=new Interf() {
//		    int x=999;
//			@Override
//			public void interfMethod() {
//				System.out.println(this.x); //In Anonymous inner class this always represent current inner class object/variable
//				System.out.println(ThisKeywordWithAnonymousInnerClass.this.x);
//			}
//		};
//		interf.interfMethod();
//	}
//	
//   public static void main(String[] args) {
//	  ThisKeywordWithAnonymousInnerClass invoke=new ThisKeywordWithAnonymousInnerClass();
//	  invoke.classMethod();
//   }
//}