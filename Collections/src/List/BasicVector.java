package List;

import java.util.Vector;

public class BasicVector 
{
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		
		//adding Elements to end
		v.add("First");
		v.add("Second");
		v.add("Third");
		System.out.println(v);
		
		//adding element at specified index
		v.add(2, "Random");
		System.out.println(v);
		
		//getting elements by index
		System.out.println("Element at index 3 is: "+v.get(3));
		
		//getting first element
	
		System.out.println("The first element of this vector is: " +v.firstElement());
		
		//getting Last element
		System.out.println("The Last element of this vector is: " +v.lastElement());
		
		//how to check vector is empty or not
        System.out.println("Is this vector empty? "+v.isEmpty());
}}
