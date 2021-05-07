package StringPractice;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcpjklpxyz";
		int cnt=0;
		
		for (int i = 0; i <s.length(); i++) 
		{
		  if(s.charAt(i)=='p')	
		  {
			  cnt++;
		  }
		}

		System.out.println(cnt);
		String sa[]=new String[cnt+1];
		int si=0;
		int ei=0;
        int index=0;		
		for (int i = 0; i < s.length(); i++) 
		{
            if(s.charAt(i)=='p'||i==s.length()-1)
            {
               ei=i;
               if(i==s.length()-1)
               {
            	   ei++;
               }
               String p=s.substring(si, ei);
               sa[index++]=p;
               si=i;

            }
		}
		System.out.println(Arrays.toString(sa));
	}

}
