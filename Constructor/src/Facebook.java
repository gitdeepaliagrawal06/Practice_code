public class Facebook 
{
	String Name;
	int Age;
	int Phone;
	String Gender;
	
	public Facebook(String Name,int Age,int Phone,String Gender)
	{
		this.Name=Name;
		this.Age=Age;
		this.Phone=Phone;
		this.Gender=Gender;
		this.print();
	}
	public Facebook(String Name,int Age,int Phone)
	{
		this.Name=Name;
		this.Age=Age;
		this.Phone=Phone;
		this.print();
	}
	public void print()
	{
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Phone);
		if (Gender!=null) 
		{
			System.out.println(Gender);
		}}
public static void main(String[] args) 
{
	Facebook f1=new Facebook("Deepali",25,5555,"Female");
	Facebook f2=new Facebook("Rishu",27,5514555,"male");
	Facebook f3=new Facebook("Sohini",23,551455);
}}
