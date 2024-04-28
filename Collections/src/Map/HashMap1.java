import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap1 {

	public static void main(String[] args) 
	{
		//HashMap m=new HashMap();
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105,"Tye");
		//System.out.println(m); //{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
		m.put(103, "Deepali");
		//System.out.println(m);   //{101=John, 102=David, 103=Deepali, 104=Mary, 105=Tye}-- add Duplicate key
		m.put(106, "David");
		//System.out.println(m); //{101=John, 102=David, 103=Deepali, 104=Mary, 105=Tye, 106=David}--add Duplicate Value
	
		m.get(105);
	    //System.out.println(m.get(105);); //Tye
		
		m.remove(106);
		//System.out.println(m);   //{101=John, 102=David, 103=Deepali, 104=Mary, 105=Tye} --remove pair from hashmap
	
		//System.out.println(m.containsKey(101)); //True
		
		//System.out.println(m.containsKey(107));//false
		
		//System.out.println(m.containsValue("Mary"));//True
		//System.out.println(m.containsValue("Lav"));//false
		
		//System.out.println(m.isEmpty());// false == hasmap is naot a empty thats why its return false
		
		System.out.println(m.keySet());// it will return all the keys in the set format
		
		System.out.println(m.values()); // it will return all the values as collection
		
		System.out.println(m.entrySet()); // returns all the entries as set [101=John, 102=David, 103=Deepali, 104=Mary, 105=Tye]

//----------------------------------------------------------------------------------------------------------	
		
		for (Object i:m.keySet()) 
		{
			System.out.println(i);
		}
		
		for(Object entry:m.entrySet())
		{
			System.out.println(entry );
		}
		
		for(Object v:m.values())
		{
			System.out.println(v);
		}
		
		for(Object g:m.keySet())
		{
			System.out.println(g+"     "+m.get(g));
		}
		
		//-------------------------------------------------------------------------------------------------------------
		
		//Entry InferFace Methods
		 System.out.println("Entry InferFace Methods***********************");
		
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"    "+entry.getValue());
		} 
		
	//---------------------------------------------------------------------------------	
		//Iterator()
	   System.out.println("we use Iterator***********************");	
	   Set s=m.entrySet();
	   
	   Iterator it=s.iterator();
	   
	   while (it.hasNext()) 
	   {
		Map.Entry entry = (Entry) it.next();
		
	    System.out.println(entry.getKey()+"        "+entry.getValue());
	    
	    System.out.println("we use Iterator 2nd way***********************");   
	    //2nd way by Iterator
	    
	    Iterator<Integer> itr=m.keySet().iterator();
		while (itr.hasNext())
		{
		  Integer key= itr.next();
		  String value =m.get(key);
		  System.out.println("Key= "  +  key  +  "Value= "+value);
		
	      //System.out.println("Key = "+key + "Value = "+value);
		}
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
