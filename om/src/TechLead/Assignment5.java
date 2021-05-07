package TechLead;

public class Assignment5 {
	public static void main(String[] args) {
		
		String s="aba 12321 aja";
		String []a=s.split(" ");
		int pcnt=0;
		for (int i = 0; i < a.length; i++) 
		{  
			String p=a[i];
			int cnt=0;
			for (int j = 0; j < p.length()/2; j++) 
			{
				if(p.charAt(j)!=p.charAt(p.length()-1-j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				pcnt++;
				System.out.println(pcnt+" "+"pallendrome");
			}
			
		}
		System.out.println(pcnt+"String are palindrome");
	}

}
