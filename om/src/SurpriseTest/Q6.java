package SurpriseTest;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcXYZ";
		     char ca[]=s.toCharArray();
		  
		     for (int i = 0; i < ca.length; i++) 
		     {   if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		       {
				 ca[i]=((char)(s.charAt(i)-32));
		       }
				 
			 }

              for (int i = 0; i < ca.length; i++) 
              {
				ca[i]=((char)(155-ca[i]));
			  }
              System.out.println(Arrays.toString(ca));
	}

}
