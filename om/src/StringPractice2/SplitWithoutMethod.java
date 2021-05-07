package StringPractice2;

public class SplitWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc def ghi jkl";
		int si=0;
		int index=0;
		int pcnt=0;
		for (int i = 0; i <s.length(); i++) 
		{
			
		   if(s.charAt(i)==' ')
		   {
			   pcnt++;
		   }
		}
		System.out.println(pcnt);
		String sa[]=new String[pcnt+1];
		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
			int ei=i;
			if(s.charAt(i)!=' ')
			{
				s2=s2+s.charAt(i);
				sa[index++]=s2;
			}
		}



	}

}
