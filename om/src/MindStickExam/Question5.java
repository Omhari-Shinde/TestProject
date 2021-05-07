package MindStickExam;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india is my country";
		char[] ca=s.toCharArray();
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
		int index=0;
		char ca2[]=new char[ca.length-cnt];
		for (int i = 0; i < ca.length; i++) 
		{    
			cnt=0;
			for (int j = 0; j < ca2.length; j++) 
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
		int max=Integer.MIN_VALUE;
		char c=0;
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
		if(cnt>max)
		{
			max=cnt;
			c=ca2[i];
			
		}
	  }
      System.out.println("first max frequency="+max);
      System.out.println("carecter of frequency="+c);
      char c1=0;
      int max2=0;
      for (int i = 0; i < ca2.length; i++) 
      {
    	 int cnt2=0;
		for (int j = 0; j < ca.length; j++) 
		{
			if(ca2[i]==ca[j])
			{
				cnt2++;
				
			}
		}
		if(cnt2>max2&& cnt2!=max)
		{
			max2=cnt2;
			c1=ca2[i];
			
		}
	  }
      System.out.println("second most frequency="+max2);
      System.out.println("second charecter="+c1);
   
		
		
		
	}

}
