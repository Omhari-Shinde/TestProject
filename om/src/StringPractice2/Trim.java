package StringPractice2;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  abcde  ";
		int si=0;
		int ei=0;
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				
				break;
			}
		}
		for (int i =s.length()-1; i>=0; i--) 
		{
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		for (int i =si; i <=ei; i++) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
