
public class FetchEvenIndexArrayValue 
{
public static void main(String[] args)
{
	int[] arr={10,20,30,40,50,60,70,80,90,100};
	
	for (int i = 2; i < arr.length; i=i+2)
	{
		System.out.println(arr[i]);
	}
	
}
}
