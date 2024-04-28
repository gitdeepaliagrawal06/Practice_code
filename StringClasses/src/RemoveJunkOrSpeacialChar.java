
public class RemoveJunkOrSpeacialChar {

	public static void main(String[] args)
	{
		
		String s1= "@$#*@ Testing @$#*@ Selenium @$#*@ Java  123458";
		
		//Reguler Expresion [^a-zA-Z0-9]
		
		s1= s1.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(s1);
		}
	}
