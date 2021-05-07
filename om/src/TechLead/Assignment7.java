package TechLead;

import java.util.Arrays;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAAAAAAABBBBBCCCCCCDDD1111111DDDEEEEEEEEFF";
		char ca[]=s.toCharArray();
		int cnt=0;
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j =i+1; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					cnt++;
					break;
				}
			}
		}
		char ca2[]=new char[ca.length-cnt];
		int index=0;
		for (int i = 0; i < ca.length; i++) 
		{  
			cnt=0;
			for (int j = 0; j < ca2.length; j++) 
			{
			  if(ca[i]==ca2[j])
			  {
				  cnt++;
			  }
			}
			if(cnt==0)
			{
				ca2[index++]=ca[i];
			}
		}
		System.out.println(Arrays.toString(ca2));
		

	}

}
