package List;

import java.util.ArrayList;

import collectionConcept.Employee;

public class ArrayListConcept
{
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		
		ar.add(50);
		ar.add(50);
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		System.out.println("*****Using For Loop");
		
		for (int i =0; i<ar.size(); i++) 
		{
			System.out.println(ar.get(i));
			
		}
		
		System.out.println("****Generic Concept****");
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("selenium"); not applicable
		System.out.println(ar1.get(0));
		
	
	 ArrayList<String> ar2=new ArrayList<String>();
	 ar2.add("Test");
	 ar2.add("Selenium");
	 
	 //Employee class Object
	 
	 Employee e1=new Employee("Naveen",25,"QA");
	 Employee e2=new Employee("Peter",26,"Dev");
	 Employee e3=new Employee("Deepali",27,"Admin");
	 
	 //create ArrayList
	 
	 ArrayList<Employee> ar4=new ArrayList<Employee>();
	 ar4.add(e1);
	 ar4.add(e2);
	 ar4.add(e3);
	 
	//Iterator to traverse the values
	 
//	 Iterator<Employee> it=new ar4.iterator();
//	 while(it.hasNext())
//	 {
//		 Employee emp=it.next();
//		 System.out.println(emp.name);
//		 System.out.println(emp.age);
//		 System.out.println(emp.dept);
//	 }
//	 
	 //addAll
	 ArrayList<String> ar5=new ArrayList<String>();
	 ar5.add("Test");
	 ar5.add("Selenium");
	 ar5.add("QTP");
	
	 ArrayList<String> ar6=new ArrayList<String>();
	 
	 ar6.add("Dev");
	 ar6.add("Java");
	 ar6.add("JavaScript");
	
	ar5.addAll(ar6);
	for (int i =0; i <ar5.size(); i++) 
	{
		System.out.println(ar5.get(i));
	}
//retainAll
	System.out.println("*****RetainALL*****");
ArrayList<String> ar7=new ArrayList<String>();

ar7.add("test");
ar7.add("Selenium");
ar7.add("java");

ArrayList<String> ar8=new ArrayList<String>();
ar8.add("test");
ar8.add("java");

ar7.retainAll(ar8);
for(int i=0; i<ar7.size(); i++)
{
	System.out.println(ar7.get(i));
}}
}
