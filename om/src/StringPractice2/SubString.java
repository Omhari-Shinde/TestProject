package StringPractice2;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdabcab";
		for (int i = 0; i <s.length(); i++)
		{
			for (int j = i; j <s.length(); j++) 
			{
				for (int k =i; k <=j; k++) 
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}

	}

}
