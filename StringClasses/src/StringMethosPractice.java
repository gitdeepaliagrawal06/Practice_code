
public class StringMethosPractice 
{
	public static void main(String[] args) {
		String s1="Java";
		String s2="Dil";
		String s3="java Developer";
		String s4="JAVA DEVELOPER";
		String s5="java is my favriot subject";
		String s6=" Life is Beautiful ";
		String s7="Delhi";
		String s8="QspiderLife";
		String s9="Royal Enfield";
		int i=125662;
		String s10=String.valueOf(i);//doubt---------------------
		String s11="Life is Beautiful and Life is Wonderful and Life is.....";
		
		
		System.out.println(s1.charAt(2));
	    //System.out.println(s1.charAt(20));//exception
		System.out.println(s2.concat("Khush"));
		System.out.println(s3.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s3.endsWith("er"));
		System.out.println(s3.contains("ja"));
		System.out.println(s4.equalsIgnoreCase("JAVA DEVELOPER"));
		System.out.println(s3.replace("java", "Python"));
		System.out.println(s5.replace('a', 'e'));//Replace all occurrences of 'a' to 'e'
	    System.out.println(s11.replaceFirst("Life", "Wife"));
	    System.out.println(s11.replace("Life", "Wife"));
		System.out.println(s6.trim());
		System.out.println(s6.replace(" ", ""));
		System.out.println(s7.indexOf('l'));
		System.out.println(s7.indexOf('u'));
		System.out.println(s3.indexOf('e', 7));
		System.out.println(s6.substring(15));
		System.out.println(s8.substring(0, 7));
		System.out.println(s9.lastIndexOf('l'));
		System.out.println(s10 + 10);
		System.out.println(s11.indexOf('s', 7));
		System.out.println(s11.indexOf('s', s11.indexOf('s')+1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}