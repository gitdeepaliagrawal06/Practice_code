abstract class Shape
{
	// by using abstract class we can achive Specifiction and Standaraization
	//Standaraization:--All the subClasses maintaing the same method singnature
	//as the Super class.
	//Specification:--Giving the different Implementation all the subClasses.
	
	//public void volume(); 
	{
	}
	abstract public void area();
	{
	}
	}

    public class AreaTest {
	public static void main(String[] args)
	{
		 Triangle t=new Triangle();
		 Rectangle r=new  Rectangle();
		 Circle c=new  Circle();
		 t.area();
		 r.area();
		 c.area();
	}

}
