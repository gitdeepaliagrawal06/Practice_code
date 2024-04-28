package CursorConcept;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorConcept {
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Balakrishna");
		l.add("chiru");
		l.add("Venky");
		l.add("nag");
	
		System.out.println(l);
	    ListIterator<String> itr=l.listIterator();
		//ListIterator<String> itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			if(s.equals("venky"))
			{
				itr.remove();
			}
			else if(s.equals("nag"))
			{
				itr.add("chaitu");
			}
			else if(s.equals("chiru"))
			{
				itr.set("charan");
			}
		}}}
