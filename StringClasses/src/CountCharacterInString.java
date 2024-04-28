
public class CountCharacterInString {

	public static void main(String[] args) 
	
	{
		String s ="Learn Java";
		
		int count =0;
		
		System.out.println("Length Of the String is "
				+ ""+ s.length());
		
		for (int i =0; i<s.length(); i++) 
		{
			if (s.charAt(i)!=' ')
			{
				count++;
				
			}
		}
		
       System.out.println("Count Of Characters "+count);
	}

}
