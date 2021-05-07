package om;

import java.util.Arrays;
public class AssHW30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("aba");
		StringBuffer s2=new StringBuffer("abcba");
		StringBuffer s3=new StringBuffer("madam");
		StringBuffer s4=new StringBuffer("121");
		StringBuffer s5=new StringBuffer("abcd");
		StringBuffer s[]= {s1,s2,s3,s4,s5};
		int cnt=0;
		int pcnt=0;
		for (int i = 0; i < s.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < s[i].length(); j++) 
			{
				if(s[i].charAt(j)!=s[i].charAt(s[i].length()-1-j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				pcnt++;
			}
		}
		System.out.println(pcnt);
		for (int i = 0; i < s.length; i++) 
		{
			for (int j =i+1; j < s.length; j++) 
			{
			  if(s[i].length()>=s[j].length())
			  {
				 StringBuffer b=s[i];
				 s[i]=s[j];
				 s[j]=b;
			  }
			}
		}

		System.out.println(Arrays.toString(s));
	}

}
