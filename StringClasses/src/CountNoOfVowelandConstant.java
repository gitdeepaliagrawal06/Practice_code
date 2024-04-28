//WAP to Count NO Of Vowel&Constant and print it
public class CountNoOfVowelandConstant {
	public static void main(String[] args) 
	{
		String s1="lifeisbeautifulandweshouldenjoythelife";
		String removeVowel="";
		int V_count =0;
		String removeConsonent="";
		int C_count =0;
		
		for (int i=0;  i<=s1.length()-1;  i++) 
		{
			char ch= s1.charAt(i);
			if (ch =='a'||ch =='e'||ch =='i'|| ch =='o'||ch =='u')
			{
				removeVowel=removeVowel+ch;
				V_count++;
			}
			else
			{
				removeConsonent= removeConsonent+ch;
				C_count++;
			}
			
		}
            System.out.println("Vowel= " +removeVowel);
            System.out.println("Counts of Vowel= "+V_count);
	
		    System.out.println("Consonent= " +removeConsonent);
		    System.out.println("Counts of Consonent= "+C_count);
		
	}
}

