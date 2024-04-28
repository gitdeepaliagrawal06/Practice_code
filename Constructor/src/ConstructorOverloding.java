
public class ConstructorOverloding 
{
	int l;
	int b;
	String colour;
	
	  public void display()
	  {
	  	System.out.println(l);
	  	System.out.println(b);
	  	if (colour !=null)
	  	{
	  	System.out.println(colour);
	  	}
	  }
	public ConstructorOverloding (int l,int b,String colour)
	{
		this.l=l;
		this.b=b;
		this.colour=colour;
		this.display();
	}
	ConstructorOverloding (int l,int b)
	{
		this.l=l;
		this.b=b;
		this.display();
	}
	public static void main(String[] args)
	{
		ConstructorOverloding co1=new ConstructorOverloding(5,7,"Green");
		ConstructorOverloding co2=new ConstructorOverloding(10,20);

	}

}
