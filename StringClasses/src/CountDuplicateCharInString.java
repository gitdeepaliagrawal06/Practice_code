
public class CountDuplicateCharInString 
{
	public static void main(String[] args) 
	{
		String s1 ="Deepali Agrawal";
		int count=0;
		
		char[] input=s1.toCharArray();
		
		for (int i=0;  i<input.length;  i++) 
		{
			for (int j=i+1;  j<input.length;  j++) 
			{
				if (input[i]==input[j]) 
				{
					System.out.println("Duplicate char are :"+input[j]);
					count++;
					break;
				}
				
			}
			
		}
		
	}

}
