//How to spilt string in substrings using String.split() in Java?

public class JavaStringSplitPrg 
{
public static void main(String[] args) 
{
		try
		{
			String str1="www.includehelp.com";
			int loop;

			String [] arrStr1;

			//split string by delimiter ., to do this you have to provide \\.
			arrStr1 = str1.split("\\.");
			
			// print substrings
			for(loop=0;loop < arrStr1.length; loop++)
			{
				System.out.println(arrStr1[loop]);
			}
		    }
	    	 catch (Exception ex)
		{
			  ex.printStackTrace();
		}

	}

}
