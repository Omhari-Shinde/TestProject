package om;

public class LeadingAndTralingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   abc def ghi    ";
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
		for (int j= s.length()-1; j>=0;j--) 
		{
			if(s.charAt(j)!=' ')
			{
				ei=j;
				break;
			}
		}
		for (int k = si; k < ei; k++) 
		{
			System.out.print(s.charAt(k));
		}

	}

}
