package om;

public class ToLowercase {
	public static void main(String[] args) 
	{
		String s="AadfgshVD$%YFHJ";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				System.out.print((char)(s.charAt(i)+32));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
