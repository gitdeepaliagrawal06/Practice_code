interface P
{
	void run();
}
interface Q
{
	void wish();
}
class R
{
	public void fly()
	{
		System.out.println("In Fly");
	}
}
class S extends R implements P,Q
{
	public void run()
	{
		System.out.println("In Run");
	}
	public void wish()
	{
		System.out.println("In Wish");
	}
}
public class Test2 {
	public static void main(String[] args) {
	S d1=new S();
	d1.run();
	d1.wish();
	d1.fly();
	}
}
