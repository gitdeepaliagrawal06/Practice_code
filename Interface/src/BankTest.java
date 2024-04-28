interface Bank
{
	float rateOfIntrest();
}
class SBI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.75f;
	}
}
class ICICI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.25f;
	}
}

public class BankTest
{
	public static void main(String[] args)
	{
		Bank c=new ICICI();
		System.out.println("ICICI rateOfIntrest: "+c.rateOfIntrest());
		
		Bank s=new SBI();
		System.out.println("SBI rateOfIntrest: "+s.rateOfIntrest());	
	}

}
