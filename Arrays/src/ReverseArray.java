
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		int[] b=new int[5];
		int c=0;
		for (int i=a.length-1; i>=0; i--) 
		{
			b[c++]=a[i];
	
			System.out.println(a[i]+ " ");
		}
		for (int i=0; i<b.length; i++) 
		{
			System.out.print(b[i]+ " ");
		}
		
	}

}
