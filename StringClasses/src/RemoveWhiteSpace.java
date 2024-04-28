import java.util.stream.IntStream;

//WAP to Remove White Space in a given String
public class RemoveWhiteSpace 
{
public static void main(String[] args) {
	String s1="Life is Beautiful";
	String s2 = ""; // L/ Li/ Lif/
	for (int i =0; i <=s1.length()-1; i++)
	{
		char ch= s1.charAt(i);
		
		
		if(ch !=' ')
		{
			s2=s2+ch; // L+i = Li+f= Lif+e=Life
  }
	}
	System.out.println(s2);
		
	}

}
