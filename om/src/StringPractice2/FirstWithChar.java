package StringPractice2;

public class FirstWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="omhari";
		String s2="om";
		boolean b=s1.startsWith(s2);
		System.out.println(b);
		int i=0;
		int j=0;
		int comcount=0;
		if(s2.length()<s1.length())
		{
			while(comcount<s2.length())
			{
				if(s1.charAt(i)!=s2.charAt(j))
				{
					System.out.println("false");
					break;
				}
				i++;
				j++;
				comcount++;
			}
			if(comcount==s2.length())
			{
				System.out.println("true");
			}
			
		}
		else
		{
			System.out.println("false");
		}

	}

}
