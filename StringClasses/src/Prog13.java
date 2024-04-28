
public class Prog13 {
	public static void main(String[] args) 
	{
		String s1 = "Life is Beautiful";
		String s0 = "";
		for (int i = 0; i <= s1.length() - 1; i++) 
		{
			char ch = s1.charAt(i);
			if (ch !='a'||ch !='e'||ch !='i'|| ch !='o'||ch !='u') 
			{
				s0=s0+ch;
			}
		}
		System.out.print("No of Space: " + s0);
	}
}


