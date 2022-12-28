//package com.divergentsl.lamdaexpression;
//
//interface Interf{
//	public void interfMethod();
//}
//
//public class InvokeLamda9
//{
//	int x=10;
//	public void classMethod()
//	{ 
//		int y=20;
//		Interf interf= ()->{
//				 x=100;
////				 y=200;  
//					  /* In Lamda We Can Acess variables which are enclosed with class and methods
//					   * but we can'nt change the value of local variable coz it is final wheather
//					   * we declare or not but this rule is not applicable on class level variable*/
//				 System.out.println(x);
//				 System.out.println(y);
//		     };
//		interf.interfMethod();
//		x=1000;
////		y=2000;	
//		
//	}
//	
//   public static void main(String[] args) {
//	  InvokeLamda9 invoke=new InvokeLamda9();
//	  invoke.classMethod();
//   }
//}


//above same rule applicable in anonymous inner class


package com.divergentsl.lamdaexpression;

interface Interf{
	public void interfMethod();
}

public class FinalVariableInLamdaFunction
{
	int x=10;
	public void classMethod()
	{ 
		int y=20;
		Interf interf= new Interf() {
			@Override
			public void interfMethod() {
				x=100;
//				y=200;
				System.out.println(x);
				System.out.println(y);				
			}
		};
		interf.interfMethod();
//		x=1000;
//		y=2000;	
		
	}
	
   public static void main(String[] args) {
	  FinalVariableInLamdaFunction invoke=new FinalVariableInLamdaFunction();
	  invoke.classMethod();
   }
}