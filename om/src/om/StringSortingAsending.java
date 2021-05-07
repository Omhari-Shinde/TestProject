package om;

public class StringSortingAsending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"abcde","abc","ab","a"};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].length()>s[j].length())
				{
			   String s1=s[i];
					s[i]=s[j];
					s[j]=s1;
				}
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}
       
	}

}
