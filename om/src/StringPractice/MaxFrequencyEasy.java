package StringPractice;

public class MaxFrequencyEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        String s="aaaaabbbccd";
        char ca[]=s.toCharArray();
        int cnt=0;
        char ch=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ca.length; i++)
        {
        	cnt=0;
			for (int j =0; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				ch=ca[i];
			}
			
		}
        System.out.println("first max="+max+" "+ch);
        int max2=Integer.MIN_VALUE;
        int cnt2=0;
        char ch2=0;
        for (int i = 0; i < ca.length; i++)
        {
        	cnt2=0;
			for (int j =0; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					cnt2++;
				}
			}
			if(cnt2>max2&&cnt2!=max)
			{
				max2=cnt2;
				ch2=ca[i];
			}
			
		}
        System.out.println("Second max="+max2+" "+ch2);


	}

}
