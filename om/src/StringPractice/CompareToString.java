
package StringPractice;

import java.util.Arrays;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String s1="omhari";
       String s2="hari";
      boolean b= s1.contains(s2);
      System.out.println(b);
      if(s2.length()<s1.length())
      {
    	  for (int i = 0; i < s1.length(); i++) 
          {
    		if(s1.charAt(i)==s2.charAt(i))
    		{
    			
    		}
    	  } 
      }
      else
      {
    	  System.out.println("false");
      }
      
      

	}

}
