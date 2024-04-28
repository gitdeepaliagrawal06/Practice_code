
public class BiggestNoInArray 
{
public static void main(String[] args) 
{
	int[] a= {600,56,100,500,29,6,26,900};
	
	int max=a[0];// we assumed
	
	for (int i=1; i<a.length; i++) 
	{
		if(a[i]>max) 
		{
			max = a[i];
		}
	}
	System.out.println(max);
	
		
	



}
	
	
	
	

}
