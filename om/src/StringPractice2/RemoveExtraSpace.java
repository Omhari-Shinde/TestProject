package StringPractice2;

public class RemoveExtraSpace {
	public static void main(String[] args) 
	{
		String s="   ab   cd   ef   ";
		int si=0;
		int ei=0;
		String s2="";
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
			s2=s2+(s.charAt(i));
		}

		String s3="";
		for (int i = 0; i <=s2.length()-1; i++) 
		{
			if(s2.charAt(i)==' '&&s2.charAt(i+1)==' ')
			{
				
			}
			else
			{
				s3=s3+s2.charAt(i);
			}
		}
		System.out.print(s3);
		
	}

}
