package StringPractice;

public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="    abc    ab     a   abc   ";
	        int si=0;
	        int ei=0;
	        for (int i = 0; i <s.length(); i++)
	        {
				if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				{
					
				}
				else
				{
					si=i;
					break;
				}
			}
	        
	        for (int i = s.length()-1; i >=0; i--) 
	        {
				if(s.charAt(i)==' ' && s.charAt(i-1)==' ' && s.charAt(i-2)==' ')
				{
					
				}
				else
				{
					ei=i;
					break;
				}
			}
	        System.out.println(ei);
	        System.out.println(s.length()-1);
	        
//	        String s1="";
//	        for (int i = si; i <=ei; i++) 
//	        {
//	        	if(s.charAt(i)==' ' && s.charAt(i+1)==' ' && s.charAt(i+2)==' ')
//	        	{
//	        		
//	        	}
//	        	else if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
//	        		s1=s1+s.charAt(i);
//	        	else
//	        		s1=s1+s.charAt(i);
//			}
//	        System.out.println(s1);

	}

}
