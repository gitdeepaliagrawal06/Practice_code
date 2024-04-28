interface Print
{
	void print();
}
interface Show
{
	void show();
}
class A7 implements Print,Show
{
	public void show()
	{
		System.out.println("Welcome. this is show method");
	}
	public void print() 
	{
		System.out.println("this is print method");
	}
}

public class MultipleInheritaceTest
{
public static void main(String[] args) 
{
	A7 a=new A7();
	a.print();
	a.show();
 }
}
