interface A1
{
	void run();
}
 interface B1 extends A1
 {
	 void wish();
 }
 class C1 implements B1
 {
	 public void run()
	 {
		 System.out.println("In Run");
	 }
	 public void wish()
	 {
		 System.out.println("In Wish");
	 }
 }
public class Test1 {
public static void main(String[] args)
{
	C1 c=new C1();
	c.run();
	c.wish();
	}

}
