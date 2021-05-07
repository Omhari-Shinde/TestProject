package StringPractice;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String s="    omhari    shinde    latur   ";
       
       int si=0;
       int ei=0;
      
       for (int i = 0; i <s.length()-1; i++) 
       {
			if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
			{
				
			}
			else
			{
				System.out.print(s.charAt(i));
			}	
       }
	}

}
