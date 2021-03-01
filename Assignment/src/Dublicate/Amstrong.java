package Dublicate;

public class Amstrong 
{

	public static void main(String[] args) 
	{
		String str ="FORGE";
		int leg=str.length();
		char[] ch=str.toCharArray();
		
		for (int i = 0; i <leg-4; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
			  System.out.print(ch[i]=ch[j]);	
			}
		      System.out.println("F");
		}
	     
	String str1= "development";
	
	char[] ch1=str1.toCharArray();
	int count=0;
	for (char c : ch1) 
	{
		switch (c) {
		case 'a':
		case 'e':
		case 'o':
		case 'u':
		case 'i':
			count++;
			break;
			default:
				System.out.println("Vowels"+count);
			
			
			
		}
		
	}
	
	
}
}
