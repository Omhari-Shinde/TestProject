package StringPractice;
import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaabbbbbccccdddxyzaaabbbaaaaa";
		int cnt=0;
		char ca1[]=s.toCharArray();
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j =i+1; j <s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}

        System.out.println(cnt);
       char ca2[]=new char[ca1.length-cnt] ;
       int index=0;
        for (int i = 0; i <ca1.length; i++) 
        {   cnt=0;
			for (int j = 0; j < ca2.length; j++) 
			{
			 if(ca1[i]==ca2[j])
			 {
				 cnt++;
			 }
				 
			}
			if(cnt==0)
			{
				ca2[index++]=ca1[i];
			}
		}
        System.out.println(Arrays.toString(ca2));
        for (int i = 0; i < ca2.length; i++) 
        {
        	 cnt=0;
			for (int j = 0; j < ca1.length; j++) 
			{
				if(ca2[i]==ca1[j])
				{
					cnt++;
				}
			}
			int k=0;
			if(cnt>=4)
			{
				k=ca1.length-cnt+4;
				char d[]=new char[k];	
				int index2=0;
				cnt=0;
				for (int j = 0; j < ca1.length; j++) 
				{
					if(ca2[i]==ca1[j])
					{
						if(cnt<4)
						{
						d[index2++]=ca1[j];
						cnt++;
						}
					}
					else
						d[index2++]=ca1[j];
				}
				ca1=d;
			}
			
		}
        System.out.println(Arrays.toString(ca1));

	}

}
