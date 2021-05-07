package StringPractice2;

import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		char ca[]=s.toCharArray();
		for (int i = 0; i <s.length(); i++)
		{
			if(ca[i]=='b')
			{
		         ca[i]='z';
		        		  
			}
		}
		System.out.println(Arrays.toString(ca));

	}

}
