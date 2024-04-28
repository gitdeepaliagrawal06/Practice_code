package List;

import java.util.Vector;

public class ClearMyVector {

	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.add("First");
		v.add("Second");
		v.add("Third");
		v.add("Random");
		
		System.out.println("Actual Vector: "+v);
		
		v.clear();
		System.out.println("After Clearing: " +v);
		
	

	}

}
