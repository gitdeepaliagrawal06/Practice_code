
public class ChartOccurance 
{
	public static void main(String[] args) {
		
	
	String s1 ="Deepali Agrawal";
	int c = recursionMethod(s1);
	System.out.println(c);
	
	}
	static int count = 0;
	public static int recursionMethod(String str) {
		
		if(str.length()==0)
			return count;
		
		if(str.charAt(0) == 'e') {
			count++;
			recursionMethod(str.substring(1, str.length()));
		}
		else {
			recursionMethod(str.substring(1,str.length()));
		}
		
		return count;
	}
	
}
