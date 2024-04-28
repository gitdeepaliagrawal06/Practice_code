//Java program to convert any type of value to string value using String.valueOf(method
public class JavaStringReplacePrg 
{
public static void main(String[] args) 
{
	int intVal=120;
	float floatVal=12.34f;
	double doubleVal= 2345.0d;
	boolean booleanVal= true;
	
	System.out.println("After Converting into String");
	
	System.out.println("String Value Of intValue :"+ String.valueOf(intVal));
	System.out.println("String Value of floatValue :"+ String.valueOf(floatVal));
	
	System.out.println("String Value of doubleValue :"+ String.valueOf(doubleVal));
	System.out.println("String Value of floatValue :"+ String.valueOf(booleanVal));
		
	
}

}
