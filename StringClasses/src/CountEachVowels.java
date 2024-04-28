//WAP to Count each vowels in a given String
public class CountEachVowels 
{
	public static void main(String[] args) 
	{
		String s1="Slice is Delicious";
		int a_count=0;
		int e_count=0;
		int i_count=0;
		int o_count=0;
		int u_count=0;
		
		//s1 =s1.toLowerCase();
		for (int i =0; i <=s1.length()-1; i++) 
		{
			char ch=s1.charAt(i);
			if (ch=='a')
			{
			a_count++;
			}
			else if(ch=='e')
				e_count++;
			else if(ch=='i')
				i_count++;
			else if(ch=='o')
				o_count++;
			else if(ch=='u')
				u_count++;
			}
		System.out.println("a count is "+ a_count);
		System.out.println("e count is "+ e_count);
		System.out.println("i count is "+ i_count);
		System.out.println("o count is "+ o_count);
		System.out.println("u count is "+ u_count);
		}
}
	
