package CursorConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator 
{
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	ListIterator<Integer> litr= list.listIterator();
	list.add(23);
	list.add(98);
	list.add(29);
	list.add(71);
	list.add(5);
	System.out.println("Forward Direction");
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("Backward Direction");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}}}
