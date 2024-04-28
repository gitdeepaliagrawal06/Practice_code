package Map;

import java.util.HashMap;
import java.util.Map.Entry;

import collectionConcept.Employee;

public class HashMapConcept 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QPT");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry m:hm.entrySet()) //Entry is the function which has two methods getKey and getValue
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		System.out.println("We can print like this also "+hm.entrySet());
		
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer , Employee> emp=new HashMap<Integer , Employee>();
		
		Employee e1=new Employee("Tom" ,25 ,"admin");
		Employee e2=new Employee("peter" ,26 ,"QA");
		Employee e3=new Employee("steve" ,27 ,"Dev");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		for(Entry<Integer,Employee> m:emp.entrySet())
		{
			int key =m.getKey();
			Employee e=m.getValue();
			System.out.println(key + " Employee " + " Info: ");
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	}}
