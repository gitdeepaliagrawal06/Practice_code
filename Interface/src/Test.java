interface A
{
	void run();
}
class B implements A
{
	public void run()
	{
		System.out.println("In run");
	}
	}
public class Test 
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.run();
		
	}

}
