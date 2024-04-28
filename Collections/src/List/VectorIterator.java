package List;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		
		v.add("First");
		v.add("Second");
		v.add("Third");
		v.add("Random");
		
		Iterator<String> it=v.iterator();
		while(it.hasNext())
		{
			it.next();
			//System.out.println(v);

		}
		System.out.println(v);

	}

}
