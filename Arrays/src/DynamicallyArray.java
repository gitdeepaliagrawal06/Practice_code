import java.util.Scanner;

public class DynamicallyArray {
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please Enter the array size");
	int n=s.nextInt();
	int[] arr=new int[n];
	for (int i =0; i <arr.length; i++) 
	{
		System.out.println("Enter the Integer Nos");
		int m=s.nextInt();
		arr[i]=m;
	}
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i]+ ",");
		
	}
}

}
