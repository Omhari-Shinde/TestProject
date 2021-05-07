package om;

public class StringBufferPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("madam");
		StringBuffer s2=new StringBuffer("abc");
		StringBuffer s3=new StringBuffer("abcba");
        StringBuffer s4=new StringBuffer("12112");
		StringBuffer s5=new StringBuffer("hefshine");
		StringBuffer s6=new StringBuffer("om");
		StringBuffer s7=new StringBuffer("sir");
		StringBuffer s8=new StringBuffer("madam");
		StringBuffer s9=new StringBuffer("12321");
		StringBuffer s10=new StringBuffer("madam");
      StringBuffer sb[]= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
      int cnt1=0;
      for (int i = 0; i < sb.length; i++) 
      {
    	  int cnt=0;
		for (int j = 0; j < sb[i].length()/2; j++) 
		{
			if(sb[i].charAt(j)==sb[i].charAt(sb[i].length()-1-j))
			{
				cnt++;
			}
		}
		if(cnt!=0)
		{
            cnt1++;
		}

	  }

    System.out.println("palindrome count="+cnt1);


	}

}
