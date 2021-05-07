package om;

public class LowestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbcc";
		char ca[]=s.toCharArray();
		int min=Integer.MAX_VALUE;
		int cnt=0;
		char c=0;
		for (int i = 0; i < ca.length; i++) 
		{    
			cnt=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
					cnt++;
			}
			if(cnt<min)
			{
				min=cnt;
				c=ca[i];
			}
		}
		System.out.println(c+" "+min);

	}

}
