package Dublicate;

public class DuplicateInString 
{

	public static void main(String[] args)
	{
		String string= new String("sfjdkklassd");
		int count=0;
		char [] c=string.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < string.length(); i++) 
		{
			for (int j = i+1; j < string.length(); j++) 
			{
				 if (c[i] == c[j]) 
				 {
                     System.out.println(c[j]);
                     count++;
                     break;
                 }
				
	         }
			
		}
	}

}
