//How to convert a character array to string in Java?

public class ConvertCharArrayToStringPrg
{
	public static void main(String []args)
	{
		//Declare String object  
		
		//Declare character array
		char[] chrArr= {'H','e','l','l','o'}; 
		char[] ch= {'D','e','e','p','a','l','i'};

		 //1st way Convert char array to string
	   	String s1= new String(chrArr);  

		 //Print string
		 System.out.println("Value of S1 : "+s1);
		 
		 
		 
		 //2nd Way Convert char to string using method
		 String s2 = String.valueOf(ch);
		 
		//Print string
		 System.out.println("Value of S2 : "+s2);
	
	}
}  