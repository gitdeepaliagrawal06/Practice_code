package RealTimeAbstraction;

abstract class Flipkart
{
	public void logo()
	{
		System.out.println("Flipkart logo should be displayed");
	}
	abstract public void image();
	abstract public void price();
}

public class FlipkartTest
{
	public static void main(String[] args) 
	{
		ShoesSeller s=new ShoesSeller();
		s.logo();
		s.image();
		s.price();
		
		System.out.println("********************************");
		 
		WatchSeller w=new WatchSeller();
		w.logo();
		w.image();
		w.price();
     }
	
}
