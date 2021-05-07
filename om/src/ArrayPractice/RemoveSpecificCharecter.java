package ArrayPractice;

public class RemoveSpecificCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcabc";
		char ca[]=s.toCharArray();
		int b=0;
		int cnt=0;
		String s2="";
		for (int i = 0; i < ca.length; i++) 
		{

             if(ca[i]=='a')
             {
            	cnt++;
            	if(cnt==2)
            	{
            		b=i; 
            	}
             }
		}
		System.out.println(b);
		for (int i = 0; i < ca.length; i++) 
		{
			if(i!=b)
			{
				s2=s2+ca[i];
			}
		}
		System.out.println(s2);



	}

}
