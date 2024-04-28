import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) 
	{
		HashMap<String, Integer> marks=new HashMap<String, Integer>();
		
		marks.put("Maths", 78);
		marks.put("English", 80);
		marks.put("Hindi", 73);
		marks.put("Science", 75);
		marks.put("GK", 90);
		
		System.out.println(marks);
		
		for(Object i:marks.keySet())
		{
			System.out.println(i+"         "+marks.get(i));
		}
//-------------------------------------------------------------------------------------------------------------
		
	//Entry InferFace Methods
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
