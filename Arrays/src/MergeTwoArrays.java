
public class MergeTwoArrays
{
public static void main(String[] args) 
{
	int[] a= {10,20,30,40,50};
	int[] b= {1,2,3,4,5};
	int[] c=new int[a.length+b.length];
	int d=0;
	for (int i =0; i <a.length; i++) 
	{
	   c[d]	=a[i];
	   d++;
	}
	for (int i =0; i <b.length; i++) 
	{
	   c[d]	=b[i];
	   d++;
	}
	for (int i =0; i <c.length; i++) 
	{
		
		System.out.print(c[i]+ " ");
		
	}
	
	
}

}
