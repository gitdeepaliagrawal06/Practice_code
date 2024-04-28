
public class ReverseEachWord 
{
	public static void main(String[] args) {
		
		String s1="Once Upon a Time in Ladakha";
		String revEachWord ="";
		for(int i =s1.length()-1; i>0; i--)
		{
			char ch= s1.charAt(i);
			
			revEachWord =revEachWord+ch;
		}
		System.out.println(revEachWord);
		

	}
	

}
//Output should be: Ladakha in Time a Upon Once