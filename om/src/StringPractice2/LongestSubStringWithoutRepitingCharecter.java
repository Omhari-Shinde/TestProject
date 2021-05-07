package StringPractice2;

public class LongestSubStringWithoutRepitingCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababcabcd";
		int max=0;
		int startindex=0;
		int endindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j =i+1; j <s.length(); j++) 
			{    int cnt=0;
				for (int k =i; k <j; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
					{
						cnt++;	
					}
				}
				if(cnt!=0)
				{
					if((j-i)>max)
					{
						max=j-i;
						startindex=i;
						endindex=j-i;
					}
					break;
				}
				else if(j==s.length()-1)
				{
					if((j-i+1)>max)
				{
					max=j-i+1;
					startindex=i;
					endindex=j;
				}
				break;
					
				}
			}
		}
		System.out.println(max);
		for (int i =startindex; i <=endindex; i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
