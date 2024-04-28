package List;

import java.util.Vector;

public class VectorCloning {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		v.add("First");
		v.add("Second");
		v.add("Third");
		v.add("Random");
		System.out.println("Actual Vector: " +v);
		
		Vector<String> copy =(Vector<String>)v.clone();
		
		System.out.println("Cloned Vector: " +copy);
	

	}

}
