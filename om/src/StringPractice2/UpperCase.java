package StringPractice2;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcDEW";
		char ca[]=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>='a'&&ca[i]<='z')
			{
				char c=((char)(ca[i]-32));
				ca[i]=c;
			}
		}
		s=new String(ca);
		System.out.println(s);

	}

}
