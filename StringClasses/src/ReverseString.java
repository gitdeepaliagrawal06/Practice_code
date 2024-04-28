//WAP to reverse a String and check weather it is a "Palindrome" or not
public class ReverseString 
{
public static void main(String[] args) 
{
	String s1 ="MOM";
	String rev ="";
	for (int i =s1.length()-1; i>=0; i--) 
	{
		rev= rev+s1.charAt(i);
    }
	 System.out.println(rev);
	 if (s1.equalsIgnoreCase(rev)) 
	 {
	System.out.println("String is Palindrome");
	 }
	 else
	 {
		 System.out.println("String is not Palindrome");
	 }
	
	
}
}
