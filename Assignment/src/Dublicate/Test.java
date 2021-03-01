package Dublicate;

public class Test 
{
	 public void m1( StringBuilder sb)
	 {
		 System.out.println("StringBuilder");
		
	 }

		/*
		 * public void m1( String s) { System.out.println("String");
		 * 
		 * }
		 */
    
	 public void m1(Object a)
	 {
		 System.out.println("object");
	 }
	 
	 public static void main(String[] args) 
	 {
		Test test =new Test();
		test.m1(null);
	  }
}

