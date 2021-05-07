package StringPractice2;

public class SpaceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="    omhari    uttam       shinde           ";
	      String s1="";
	      int si=0;
	      int ei=0;
	      for (int i = 0; i <s.length(); i++) 
	      {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				si=i;
				break;
			}
		  }
	      for (int i =s.length()-1; i >=0; i--) 
	      {
			if(s.charAt(i)==' '&&s.charAt(i-1)==' '&&s.charAt(i-2)!=' ')
			{
				ei=i;
				break;
			}
		  }
	       
	      for (int i =si; i <=ei; i++) 
	      {
	    	  if(i<ei-1)
	    	  {
			if(s.charAt(i)==' '&&s.charAt(i+1)==' '&&s.charAt(i+2)==' ')
			{
				
			}
			else
			{
				s1=s1+s.charAt(i);
			}
	    	  }
	    	  else
	    	  {
	    		  s1=s1+s.charAt(i);
	    	  }
		  }
	      System.out.println(s1);

	}

}
