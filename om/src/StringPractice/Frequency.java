package StringPractice;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbbbbbcc";
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
		System.out.println(cnt);
		char ca2[]=new char[ca.length-cnt];
		int index=0;
		for (int i = 0; i < ca.length; i++) 
		{
			 cnt=0;
			for (int j =0; j < ca2.length; j++) 
			{
				if(ca[i]==ca2[j])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				ca2[index++]=ca[i];
			}
			
		}
		for (int i = 0; i < ca2.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(ca2[i]==ca[j])
				{
					cnt++;
				}
			}
			System.out.println(ca2[i]+" "+cnt);
		}

	}

}
