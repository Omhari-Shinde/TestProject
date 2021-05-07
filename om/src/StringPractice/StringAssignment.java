package StringPractice;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabbccddd";
		String s2="aabbccdd";
		int s1a[]=new int [122];
		int s2a[]=new int [122];
		
		for (int i = 0; i <s1.length(); i++) 
		{
			s1a[s1.charAt(i)]++;
			
		}
		for (int i = 0; i <s2.length(); i++) 
		{
			s2a[s2.charAt(i)]++;
		}
	     int diff=0;
		for (int i = 0; i < s1a.length; i++) 
		{
			int a=s1a[i];
			int b=s2a[i];
			if(a>b)
			{
				diff=diff+(a-b);
			}
			else
			{
				diff=diff+(b-a);
			}
			if(diff>1)
			{
				break;
			}
			
		}
        if(diff<=1)
        {
        	System.out.println("valid");
        }
        else
        {
        	System.out.println("not valid");
        }

	}

}
