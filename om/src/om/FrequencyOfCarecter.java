package om;

public class FrequencyOfCarecter {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaabbbbbbbbbbbccc";
		char ca[]=s.toCharArray();
		int cnt=0;
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = i+1; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					cnt++;
					break;
				}	
			}
		}

		char ca2[]=new char[ca.length-cnt];
		System.out.println(ca2.length);
		int index=0;
		for (int i = 0; i < ca.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < ca2.length; j++) 
			{
				if(ca[i]==ca2[j])
					cnt++;
			}
			if(cnt==0)
			{
				ca2[index++]=ca[i];
			}
		}
		
		for (int i = 0; i < ca2.length; i++) 
		{   cnt=0;
		   char c=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(ca2[i]==ca[j])
					cnt++;
				c=ca2[i];
			}
			System.out.println(c+" "+cnt);
		}
		
	}

}
