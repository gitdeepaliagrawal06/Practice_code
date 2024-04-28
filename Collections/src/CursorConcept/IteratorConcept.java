package CursorConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {
public static void main(String[] args) {
	
	ArrayList<Integer> l=new ArrayList<Integer>();
	for (int i =0; i <=10; i++) 
	{
		l.add(i);
	}
	System.out.println(l);
	

Iterator<Integer> it= l.iterator();
{
while(it.hasNext())
{
//Integer n =(Integer)it.next();
	int i=it.next();
	
 if(i%2==0)
	System.out.println(i);
 
 else
	it.remove();
}

  System.out.println(l);
}

}


	
	
}

