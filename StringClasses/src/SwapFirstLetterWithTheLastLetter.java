//WAP to Swap first letter with the last letter
public class SwapFirstLetterWithTheLastLetter
{
	public static void main(String[] args) 
	{
		String s1 ="frutiy";
		String s2 ="";
		
		s2= s2+s1.charAt(s1.length()-1);
		
		for (int i=0; i<=s1.length()-1; i++) 
		{
			char ch =s1.charAt(i);
			s2+=ch;
		}
		s2+=s1.charAt(0);
		System.out.println(s2);
	}
	

}
