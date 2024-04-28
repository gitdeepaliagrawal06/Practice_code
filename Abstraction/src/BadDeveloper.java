abstract class M
{
// if all method or memebers are static then that class we should declear as abstract
// so unnecessary object will not created//
	public static void run()
	{
		System.out.println("In Run");
	}
	public static void wish()
	{
		System.out.println("My Wish");
	}
	}
public class BadDeveloper 
{
	public static void main(String[] args) 
	{
		M m=new M();
		m.wish();
		m.run();
		
	}
	

}
