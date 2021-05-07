package StringPractice2;

public class EndsWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdef";
		String s2="ef";
		if(s2.length()<=s1.length())
		{
			int i=s1.length()-1;
			int j=s2.length()-1;
			int comparisioncount=0;
              while(comparisioncount<s2.length())
              {
            	  if(s1.charAt(i)!=s2.charAt(j))
            	  {
            		  System.out.println("false");
            		  break;
            	  }
            	  i--;
            	  j--;
            	  comparisioncount++;
              }
              if(comparisioncount==s2.length())
              {
            	  System.out.println("true");
              }
                   
		}
		
		else
		{
			System.out.println("false");
		}

	}

}
