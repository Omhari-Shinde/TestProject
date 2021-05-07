package TechLead;

import java.util.Arrays;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABBBBBBBBAAAAAAAADEEEEEEEF";
		
		for (int i = 0; i <s.length(); i++) 
		{    int cnt=0;
			for (int j =0; j <s.length(); j++) 
			{
				if(i!=j&&s.charAt(i)==s.charAt(j))
				{
					cnt++;
					
				}
			}
			if(cnt==0)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}


	}

}
