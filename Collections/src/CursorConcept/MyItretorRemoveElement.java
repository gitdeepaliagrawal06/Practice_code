package CursorConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyItretorRemoveElement {
	public static void main(String[] args) 
	{
		String removElement= "perl";
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Oracal");
		list.add("perl");
		System.out.println("Before Remove");
		System.out.println(list);
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
          if(removElement.equals(it.next()))
          {
        	  it.remove();
          }
		}
		System.out.println("After Remove");
		System.out.println(list);
		
		
	}

}
