package CursorConcept;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		Enumeration<String> em=v.elements();
		v.add("java");
		v.add("selenium");
		v.add("python");
		v.add("unix");
		v.add("c");
		v.add("perl");
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		

	}

}
