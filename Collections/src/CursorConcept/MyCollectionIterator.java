package CursorConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionIterator {
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("java");
		l.add("unix");
		l.add("python");
		l.add("c");
		l.add("c++");
		l.add("C++");
		Iterator<String> itr= l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
