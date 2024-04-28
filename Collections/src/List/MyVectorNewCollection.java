package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVectorNewCollection
{
public static void main(String[] args) 
{
	Vector<String> v=new Vector<String>();
	v.add("First");
	v.add("Second");
	v.add("Third");
	v.add("Random");
	System.out.println("Actual Vector: "+v);
	
	List<String> list=new ArrayList<String>();
	list.add("one");
	list.add("Two");
	v.addAll(list);
	System.out.println("After Copy: " +v);
}}
