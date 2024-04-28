class Mobile
		{
	public void calling()
			{
				System.out.println("Calling");
			}
	}
		
		class Iphone extends Mobile
		{
			public void calling()
			{
				System.out.println("Calling from Iphone");
			}
			public void camera ()
			{
				System.out.println("Camera On");
			}
		}
		public class UseMobile{
		public static void main(String[] args)
		{
//	    Iphone p=new Iphone();	
//		Mobile m=new Iphone();
//		m.calling();
//		//m.camera(); //compile time error
//		
//		//DownCasting
//		Iphone.p=(Iphone)m;
//		p.calling();
//	    p.camera();
			
			 Mobile m=new Iphone();
//	        Mobile d=new Mobile();
		Iphone p=new Iphone();	
//          	Mobile m=(Mobile)p;
             	m.calling();
             	p.camera();
             	p.calling();
//			
//	    
//	    Dog d = new Dog();      
//        Animal a = (Animal)d;
//        d.callme();
//        a.callme();
//        ((Dog) a).callme2();

	}

}
