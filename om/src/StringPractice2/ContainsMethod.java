package StringPractice2;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		char ch='g';
		boolean flag=false;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==ch)
			{
				flag=true;
			}
		}
		System.out.println(flag);

	}

}
