import java.util.Scanner;

//Java program to concatenate two strings without using library function.
public class ConcatStringWithoutLibFunction
{
	public static void main(String[] args) 
	{
 //create scanner class object
  Scanner sc=new Scanner(System.in);
		
 //Display message for user to take first string input from keyboard 
  
  System.out.println("Enter First String");
  String FirstName =sc.nextLine();
  
  System.out.println("Enter Last String");
  String LastName =sc.nextLine();
  
  System.out.println("Result after concatenation:");
  
  /* '+' operator concatenate string */
	System.out.println(FirstName+ " " +LastName);
  
  
		
	}
}
