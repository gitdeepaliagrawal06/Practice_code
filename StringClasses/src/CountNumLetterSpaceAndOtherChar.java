
public class CountNumLetterSpaceAndOtherChar {

	public static void main(String[] args) 
	{
		String test ="Aa,kiu,I,swd,skieo,23598412 . GH Kiu: siep?? 25.33";
		
		int letter_Count =0;
		int space_Count =0;
		int specialChar_Count =0;
		int number_Count =0;
		int upperCase_Count =0;
		int lowerCase_Count =0;
		
		
		char [] ch =test.toCharArray();
		
		for(int i=0; i<=ch.length-1; i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter_Count++;
			}
			 if (Character.isUpperCase(ch[i]))
			{
				 upperCase_Count++;
			}
				
			 if (Character.isLowerCase(ch[i])) 
			{
				 lowerCase_Count++;
			}
				
			
		 if(Character.isDigit(ch[i]))
			{
				number_Count++;
			}
			if(Character.isSpaceChar(ch[i])) 
			{
		      space_Count++;
			}
			else 
			{
				specialChar_Count++;
			}
			}
	System.out.println("Count of letter "+letter_Count);
	System.out.println("Count of Number "+number_Count);
	System.out.println("Count of Space "+space_Count);
	System.out.println("Count of SpecialChar "+specialChar_Count);
	System.out.println("Count of UpperCase_Count "+upperCase_Count);
	System.out.println("Count of LowerCase "+lowerCase_Count);

	}

	
		
	}
