
abstract public class A
{
    abstract public void wish();
    
	 public void run()
	{
		System.out.println("in run");
	}
	
	
	class B extends A
	{
		public void wish()
		{
			System.out.println("In Wish");
		}}
	

	public static void main(String[] args) 
	{
		
     B b1=new B();
     b1.run();
     b1.wish();
        
	}

}
