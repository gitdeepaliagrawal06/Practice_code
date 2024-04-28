abstract  class Car
{
	abstract public void color();
	public void mileage()
	{
		System.out.println("car mileage");
	}
	
}
public class CarTest
{
	public static void main(String[] args) 
	{
		HondaCity hc=new HondaCity();
		hc.color();
		hc.mileage();
	}

}
