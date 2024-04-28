package List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
         v.add("First");
         v.add("Second");
         v.add("Third");
         v.add("Random");
         Enumeration<String> enm =v.elements();
         while(enm.hasMoreElements()){
             System.out.println(enm.nextElement());    
         
         
	}

	}}
