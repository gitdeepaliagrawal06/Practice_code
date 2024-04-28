
public class FacebookCons 
{
	String Name;
	int Age;
	long Phone;
	String Gender;
	
	public void display()
	{
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Phone);
		if(Gender!=null)
		{
			System.out.println(Gender);
		}
	}
	FacebookCons(String Name,int Age,long Phone, String Gender)
	{
		this.Name=Name;
		this.Age= Age;
		this.Phone= Phone;
		this.Gender= Gender;
		this.display();
	}
	FacebookCons(String name,int age,long phone)
	{
		this.Name=name;
		this.Age=age;
		this.Phone=phone;
		this.display();
	}
	public static void main(String[] args) 
	{
		FacebookCons f1=new FacebookCons("Sumit", 22,947964686 ,"Male");
		FacebookCons f2=new FacebookCons("Richa",25,947964686);// doubt 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
