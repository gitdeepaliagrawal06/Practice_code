import java.util.Scanner;

public class CreateArrayAddArrayUsingMethod {
public static void main(String[] args) {

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
	print(arr);
}

	
public static void print(int[] arr1)
{
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}

}
}
