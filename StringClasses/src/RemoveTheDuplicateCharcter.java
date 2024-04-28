//WAP to remove the duplicate character from the given String "java is easy"
public class RemoveTheDuplicateCharcter 
{
	public static void main(String[] args) 
	{
		String s1= "java is one of the easy language";
		String s2 ="";
		int count =0;
		for (int i =0; i <=s1.length()-1; i++) 
		{
			//int count =0;
			for (int j=0; j<=s2.length()-1; j++)
			{
				if (s1.charAt(i)==s2.charAt(j))
				{
					count++;
					break;
				}}
			if(count==0)
			{
				s2+=s1.charAt(i);
			}}
		System.out.println(s2);
		
	}

}
 