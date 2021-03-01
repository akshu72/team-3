

public class Overloading 
{

	public static void main(String[] args) 
	{ 
		int a=20;
		int b=30;
		 Overloading overloading=new Overloading();
		 overloading.m1(a, b);
		 }
	public void m1(int a,int b,int c)
	{
		System.out.print("Akshay");
	}
	
	public void m1(int a,int b)
	{
		System.out.println(a+b);
	}
}
