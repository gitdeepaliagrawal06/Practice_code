
public class DuplicateElementArray2 
{
	
public static void main(String[] args) 
{
	int arr[]= {1,2,5,2,6,8,3,5,1,3,}; 
	
	for (int i=0;  i<arr.length;  i++) 
	{
		
		for (int j=i+1;  j<arr.length;  j++) 
		{
			
			if (arr[i]==arr[j]&& i!=j)
			{
				
				System.out.println("Dupticate Element :"+ arr[i]);
			}
			
		}
	}
	
}
}
