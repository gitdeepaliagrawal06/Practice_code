interface Car
{
	void start();
	void accelerate();
	void stop();
}
class Audi implements Car
{
	public void start()
	{
		System.out.println("Audi starts");
	}
	public void accelerate()
	{
		System.out.println("Audi accelerate");
	}
	public void stop()
	{
		System.out.println("Audi stop");
	}
	}
class BMW implements Car
{
	public void start()
	{
		System.out.println("BMW starts");
	}
	public void accelerate()
	{
		System.out.println("BMW accelerate");
	}
	public void stop()
	{
		System.out.println("BMW stop");
	}
}
public class CarTest 
{
	public static void main(String[] args) 
	{
		Audi a=new Audi();
	    a.start();
	    a.accelerate();
	    a.stop();
	    
	    BMW b=new BMW();
	    b.start();
	    b.accelerate();
	    a.stop();
	}

}
