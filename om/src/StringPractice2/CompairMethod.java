package StringPractice2;

public class CompairMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abk";
		String s2="abck";
		System.out.println(s1.compareTo(s2));
		int cnt=0;
		if(s1.length()==s2.length())
		{
			for (int i = 0; i <s1.length(); i++) 
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					 cnt++;
					int d=s1.charAt(i)-s2.charAt(i);
					System.out.println(d);
					break;
					
				}
			}
			if(cnt==0)
			{
				System.out.println(0);
			}
		}
		else
		{

          int d=s1.length()-s2.length();
          System.out.println(d);

		}
	}

}
