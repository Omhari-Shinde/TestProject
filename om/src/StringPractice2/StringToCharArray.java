package StringPractice2;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		char ca[]=new char[s.length()];
		for (int i = 0; i < s.length(); i++) 
		{
			ca[i]=s.charAt(i);
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.println(ca[i]);
		}

	}

}
