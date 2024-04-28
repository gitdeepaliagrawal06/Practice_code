//WAP to count no of space in a given String
public class CountNoOfSpace {
	public static void main(String[] args) {
		String s1 = "Life is Beautiful";
		int count = 0;
		
		for (int i=0;  i<=s1.length()-1;  i++) {
			char ch = s1.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.print("No of Space " + count);
	}
}
