public class MethodOverLoading 
{
	public void run(int i)
	{
		System.out.println("Hello");
	}
	public void run(int i,int j)
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		MethodOverLoading m1=new  MethodOverLoading();
		m1.run(5);
		m1.run(25, 35);
		m1.run(3);		
		
	}
	

}
