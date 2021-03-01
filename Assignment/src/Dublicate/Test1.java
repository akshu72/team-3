package Dublicate;

import Dublicate.Test1;

public class Test1 extends Test
{
 public void m1(String s)
{
	 System.out.println("OBJECT");
	
}
 public static void main(String[] args) 
	{
		Test test=new Test1();
	
		 test.m1(null);
		
	 }
}
